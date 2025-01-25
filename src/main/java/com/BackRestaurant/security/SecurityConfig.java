package com.BackRestaurant.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	private ApplicationConfig appConfig;
	
	private JwtAuthFilter authFilter;

	public SecurityConfig(@Autowired ApplicationConfig appConfig,@Autowired JwtAuthFilter authFilter) {
		this.appConfig = appConfig;
		this.authFilter = authFilter;
	}
	
	@Bean
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		return http.csrf(c->c.disable())
				.authorizeHttpRequests(
						auth->{
							auth.requestMatchers("/v2/**");
							auth.anyRequest().authenticated();
						})
				.sessionManagement(s->s.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
				.authenticationProvider(appConfig.authenticationProvider())
				.addFilterBefore(authFilter, UsernamePasswordAuthenticationFilter.class)
				.build();
	}
}

package com.BackRestaurant.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BackRestaurant.models.MyUser;

public interface IMyUserRepository extends JpaRepository<MyUser, Long>{

	Optional<MyUser> findByEmail(String email);
}

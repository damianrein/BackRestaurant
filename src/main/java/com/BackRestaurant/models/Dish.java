package com.BackRestaurant.models;

import java.math.BigDecimal;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Dish {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Set<String> ingredients;
	private String urlImage;
	private String description;
	private BigDecimal price;
	
	public String getUrlImage() {
		return urlImage;
	}
	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Set<String> getIngredients() {
		return ingredients;
	}
	public void setIngredients(Set<String> ingredients) {
		this.ingredients = ingredients;
	}
	public void addIngredient(String i) {
		this.ingredients.add(i);
	}
	public void removeIngredient(String i) {
		this.ingredients.remove(i);
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Long getId() {
		return id;
	}
}

package com.BackRestaurant.models;

import java.math.BigDecimal;

import jakarta.persistence.Entity;

@Entity
public class Dish {

	private Long id;
	private String[] ingredients;
	private BigDecimal price;
	
}

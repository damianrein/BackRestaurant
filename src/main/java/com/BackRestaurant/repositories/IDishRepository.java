package com.BackRestaurant.repositories;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BackRestaurant.models.Dish;

public interface IDishRepository extends JpaRepository<Dish, Long>{

	Set<Dish> findByIngredientsIn(Set<String> ingredients);
	
	Set<Dish> findByIngredientsNotIn(Set<String> ingredients);
}

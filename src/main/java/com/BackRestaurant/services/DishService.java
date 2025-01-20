package com.BackRestaurant.services;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.BackRestaurant.models.Dish;
import com.BackRestaurant.repositories.IDishRepository;

@Service
public class DishService {

	private IDishRepository repo;

	public DishService(IDishRepository repo) {
		this.repo = repo;
	}
	
	public void addDish(Dish dish) {
		repo.save(dish);
	}
	
	public void deleteDish(Long id) {
		repo.deleteById(id);
	}
	
	public List<Dish> getAllDish(){
		return repo.findAll();
	}
	
	public Dish getById(Long id) {
		return repo.findById(id).get();
	}
	
	public Set<Dish> findWithIngredients(Set<String> ingredients){
		return repo.findByIngredientsIn(ingredients);
	}
	
	public Set<Dish> findDishWithoutIngredients(Set<String> ingredients){
		return repo.findByIngredientsNotIn(ingredients);
	}
}

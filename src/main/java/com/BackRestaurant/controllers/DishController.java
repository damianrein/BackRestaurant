package com.BackRestaurant.controllers;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.BackRestaurant.models.Dish;
import com.BackRestaurant.services.DishService;

@RestController
@RequestMapping("/v2")
public class DishController {

	@Autowired
	private DishService service;

	public DishController(@Autowired DishService service) {
		this.service = service;
	}
	
	@GetMapping("/")
	public ResponseEntity<List<Dish>> findAll(){
		return ResponseEntity.ok(service.getAllDish());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Dish> findDish(@PathVariable Long id){
		return ResponseEntity.ok(service.getById(id));
	}
	
	@GetMapping("/with")
	public ResponseEntity<Set<Dish>> findWith(@RequestParam Set<String> ingredients){
		return ResponseEntity.ok(service.findWithIngredients(ingredients));
	}
	
	@GetMapping("/without")
	public ResponseEntity<Set<Dish>> findWithout(@RequestParam Set<String> ingredients){
		return ResponseEntity.ok(service.findDishWithoutIngredients(ingredients));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteDishById(@PathVariable Long id){
		service.deleteDish(id);
		return ResponseEntity.noContent().build();
	}
	
	@PostMapping("/")
	public ResponseEntity<?> createDish(@RequestBody Dish dish){
		service.addDish(dish);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
}

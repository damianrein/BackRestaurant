package com.BackRestaurant.models;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private List<Dish> dishes;
	private BigDecimal total;
	
	public Account() {}
	
	public Account(Long id, List<Dish> dishes, BigDecimal total) {
		this.id = id;
		this.dishes = dishes;
		this.total = total;
	}
	
	public List<Dish> getDishes() {
		return dishes;
	}
	public void setDishes(List<Dish> dishes) {
		this.dishes = dishes;
	}
	public void addDish(Dish dish) {
		dishes.add(dish);
	}
	public void removeDish(Dish dish) {
		dishes.remove(dish);
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	public Long getId() {
		return id;
	}
	
	public BigDecimal calculateTotal(List<Dish> dishes) {
		return dishes.stream()
				.map(Dish::getPrice)
				.reduce(BigDecimal.ZERO, BigDecimal::add);
	}
}

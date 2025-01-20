package com.BackRestaurant.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Table {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Short maxCapacity;
	private Boolean enable;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Short getCapacity() {
		return maxCapacity;
	}
	public void setCapacity(Short maxCapacity) {
		this.maxCapacity = maxCapacity;
	}
	public Long getId() {
		return id;
	}
	public Boolean getEnable() {
		return enable;
	}
	public void setEnable(Boolean enable) {
		this.enable = enable;
	}
}

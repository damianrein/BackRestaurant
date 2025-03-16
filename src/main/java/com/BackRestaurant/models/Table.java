package com.BackRestaurant.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Table {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	private Short number;
	@Min(2)
	private Short maxCapacity;
	private Boolean enable;
	
	public Short getNumber() {
		return number;
	}
	public void setName(Short number) {
		this.number = number;
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

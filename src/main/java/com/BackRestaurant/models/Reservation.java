package com.BackRestaurant.models;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
public class Reservation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	private Table table;
	@NotNull
	private Short diners;
	@NotNull
	private LocalDateTime date;
	
	private LocalDateTime finishDate;
	@NotNull
	private MyUser client;
	
	
	
	public Reservation(Long id, @NotNull Table table, @NotNull Short diners, @NotNull LocalDateTime date,
			@NotNull MyUser client) {
		this.id = id;
		this.table = table;
		if(diners >= table.getCapacity()) {
			this.diners = diners;
		}else {throw new IllegalArgumentException("El número de comensales no puede exceder la capacidad máxima de la mesa");}
		this.date = date;
		this.client = client;
	}
	public Table getTable() {
		return table;
	}
	public void setTable(Table table) {
		this.table = table;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	public MyUser getClient() {
		return client;
	}
	public void setClient(MyUser client) {
		this.client = client;
	}
	public Long getId() {
		return id;
	}
	public Short getDiners() {
		return diners;
	}
	public void setDiners(Short diners) {
		this.diners = diners;
	}
}

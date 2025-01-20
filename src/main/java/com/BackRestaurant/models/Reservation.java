package com.BackRestaurant.models;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Reservation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Table table;
	private Short diners;
	private LocalDateTime date;
	private MyUser client;
	
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

package com.BackRestaurant.models;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;

@Entity
public class Reservation {

	private Long id;
	private Table table;
	private LocalDateTime hour;
	private MyUser client;
	
}

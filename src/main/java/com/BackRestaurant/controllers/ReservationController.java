package com.BackRestaurant.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BackRestaurant.models.Reservation;
import com.BackRestaurant.services.ReservationService;

@RestController
@RequestMapping("/v1")
public class ReservationController {

	private ReservationService service;

	public ReservationController(@Autowired ReservationService service) {
		this.service = service;
	}
	
	@PostMapping("/")
	public ResponseEntity<?> reserve(Reservation r){
		service.createReservation(r);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	@DeleteMapping
	public ResponseEntity<?> cancelReservation(@PathVariable Long id){
		service.cancelReservation(id);
		return ResponseEntity.noContent().build();
	}
}

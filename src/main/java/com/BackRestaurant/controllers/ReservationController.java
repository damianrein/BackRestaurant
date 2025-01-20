package com.BackRestaurant.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BackRestaurant.services.ReservationService;

@RestController
@RequestMapping("/v1")
public class ReservationController {

	private ReservationService service;

	public ReservationController(ReservationService service) {
		this.service = service;
	}
	
}

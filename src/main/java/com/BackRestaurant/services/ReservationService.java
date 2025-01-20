package com.BackRestaurant.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BackRestaurant.repositories.IReservationRepository;

@Service
public class ReservationService {

	@Autowired
	private IReservationRepository repo;

	public ReservationService(@Autowired IReservationRepository repo) {
		this.repo = repo;
	}
	
	public void cancelReservation(Long id) {
		repo.deleteById(id);
	}
}

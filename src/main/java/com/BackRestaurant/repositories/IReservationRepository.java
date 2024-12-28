package com.BackRestaurant.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BackRestaurant.models.Reservation;

public interface IReservationRepository extends JpaRepository<Reservation, Long> {

}

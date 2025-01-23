package com.BackRestaurant.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BackRestaurant.models.MyUser;

public interface IMyUserRepository extends JpaRepository<MyUser, Long>{

}

package com.BackRestaurant.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BackRestaurant.models.MyUser;
import com.BackRestaurant.repositories.IMyUserRepository;

@Service
public class MyUserService {

	private IMyUserRepository repo;

	public MyUserService(@Autowired IMyUserRepository repo) {
		this.repo = repo;
	}
	
	public List<MyUser> findAllUser(){
		return repo.findAll();
	}
	
	public void deleteUser(Long id) {
		repo.deleteById(id);
	}
}

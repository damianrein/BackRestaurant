package com.BackRestaurant.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.BackRestaurant.models.Table;
import com.BackRestaurant.repositories.ITableRepository;

@Service
public class TableService {

	private ITableRepository repo;

	public TableService(ITableRepository repo) {
		this.repo = repo;
	}
	
	public void addTable(Table table) {
		repo.save(table);
	}
	
	public void deleteTableById(Long id) {
		repo.deleteById(id);
	}
	
	public List<Table> findEnableTables(){
		return repo.findByEnable(true);
	}
}

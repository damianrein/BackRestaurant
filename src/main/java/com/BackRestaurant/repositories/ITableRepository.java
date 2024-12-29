package com.BackRestaurant.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BackRestaurant.models.Table;

public interface ITableRepository extends JpaRepository<Table, Long>{

	List<Table> findByEnable(Boolean enable);
}

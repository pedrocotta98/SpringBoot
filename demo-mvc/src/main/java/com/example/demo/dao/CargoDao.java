package com.example.demo.dao;

import java.util.List;

import com.example.demo.domain.Cargo;
import com.example.demo.domain.Departamento;

public interface CargoDao {

	
	void save(Cargo cargo);

	void update(Cargo cargo);

	void delete(Long id);

	Cargo findById(Long id);
	
	List<Cargo> findAll();
}

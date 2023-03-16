package com.ogurek.helloplant.services;

import java.util.Optional;

import com.ogurek.helloplant.entities.Plant;

public interface PlantService {
	public Plant create(Plant plant);
	public Optional<Plant> getById (int id);
//	public Plant update (Plant plant);
	public void deleteById(int id);
}

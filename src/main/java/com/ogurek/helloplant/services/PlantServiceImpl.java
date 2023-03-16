package com.ogurek.helloplant.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ogurek.helloplant.entities.Plant;
import com.ogurek.helloplant.repositories.PlantRepository;

@Service("plantService")
public class PlantServiceImpl implements PlantService{
	
	@Autowired
	private PlantRepository plantRepository;

	@Override
	public Plant create(Plant plant) {
		return plantRepository.save(plant);
	}

	@Override
	public Optional<Plant> getById(int id) {
		return plantRepository.findById(Integer.valueOf(id));
	}

	@Override
	public void deleteById(int id) {
		plantRepository.deleteById(id);
	}
}

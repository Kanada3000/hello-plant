package com.ogurek.helloplant.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ogurek.helloplant.entities.Plant;
import com.ogurek.helloplant.services.PlantService;

@RestController
@RequestMapping("plant")
public class PlantController {

	@Autowired
	private PlantService plantService;
	
	@PostMapping("/add")
	public Plant add(@RequestBody Plant plant) {
		return plantService.create(plant);
	}
	
	@GetMapping("/get/{id}")
	public Plant getById(@PathVariable int id) {
		return plantService.getById(id).orElse(null);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable int id) {
		plantService.deleteById(id);
	}
}

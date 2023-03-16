package com.ogurek.helloplant.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ogurek.helloplant.entities.Plant;

public interface PlantRepository extends CrudRepository<Plant, Integer>{

}

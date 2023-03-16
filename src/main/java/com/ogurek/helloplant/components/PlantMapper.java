package com.ogurek.helloplant.components;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.ogurek.helloplant.dto.PlantDTO;
import com.ogurek.helloplant.entities.Plant;

@Mapper
public interface PlantMapper {

	PlantMapper INSTANCE = Mappers.getMapper(PlantMapper.class);
	
	PlantDTO plantToPlantDTO(Plant plant);
}

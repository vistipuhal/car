package com.tata.tms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.tata.tms.dto.CarData;

public interface TyreRepo extends CrudRepository<CarData, String>{

	@Query(
			value = "SELECT * FROM CAR_DATA c WHERE c.name =?1",
			nativeQuery = true)
	List<CarData> findCarByName(String carName);
	
	@Query(
			value = "SELECT * FROM CAR_DATA c WHERE c.manufactName =?1",
			nativeQuery = true)
	List<CarData> findCarByManufactName(String manufactName);

	@Query(
			value = "SELECT * FROM CAR_DATA c WHERE c.model =?1",
			nativeQuery = true)
	List<CarData> findCarByModel(String model);
	
	@Query(
			value = "SELECT * FROM CAR_DATA c WHERE c.manufactYear =?1",
			nativeQuery = true)
	List<CarData> findCarByYear(String year);

	@Query(
			value = "SELECT * FROM CAR_DATA c WHERE c.color =?1",
			nativeQuery = true)
	List<CarData> findCarByColor(String color);

}

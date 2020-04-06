package com.tata.tms.service;

import java.util.List;

import com.tata.tms.dto.CarData;

public interface TyreService {

	public String addCar(CarData car) throws Exception;
	
	public String updateCar(CarData car) throws Exception;

	public String deleteCar(String carNum) throws Exception;

	public List<CarData> findCarByName(String carName) throws Exception;
	
	public List<CarData> findCarByManufactName(String manufactName) throws Exception;
	
	public List<CarData> findCarByModel(String model) throws Exception;
	
	public List<CarData> findCarByYear(String year) throws Exception;
	
	public List<CarData> findCarByColor(String color) throws Exception;


	
}

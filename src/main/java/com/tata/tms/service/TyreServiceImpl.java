package com.tata.tms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tata.tms.dao.TyreRepo;
import com.tata.tms.dto.CarData;

@Service
public class TyreServiceImpl implements TyreService{

	@Autowired
	TyreRepo tyreRepo;
	
	@Override
	public String addCar(CarData car) throws Exception{
		try {
		tyreRepo.save(car);
		}
		catch(Exception e) {
			throw new Exception(e.getMessage());
		}
		return "saved successfully";
	}

	@Override
	public String updateCar(CarData car) throws Exception{
		
		try {
		CarData dbCar = tyreRepo.findOne(car.getCarId());
		
		dbCar.setCarName(car.getCarName());
		dbCar.setManufactName(car.getManufactName());
		dbCar.setModel(car.getModel());
		dbCar.setManufactYear(car.getManufactYear());
		dbCar.setColor(car.getColor());
		
		tyreRepo.save(dbCar);
		}
		catch(Exception e) {
			throw new Exception(e.getMessage());
		}
		
		return "updated successfully";
	}

	@Override
	public List<CarData> findCarByName(String carName) throws Exception{
		return tyreRepo.findCarByName(carName);
	}

	@Override
	public List<CarData> findCarByManufactName(String manufactName) throws Exception{
		return tyreRepo.findCarByManufactName(manufactName);
	}

	@Override
	public List<CarData> findCarByModel(String model) throws Exception{
		return tyreRepo.findCarByModel(model);
	}

	@Override
	public List<CarData> findCarByYear(String year) throws Exception{
		return tyreRepo.findCarByYear(year);
	}

	@Override
	public List<CarData> findCarByColor(String color) throws Exception{
		return tyreRepo.findCarByColor(color);
	}


	@Override
	public String deleteCar(String carNum) throws Exception{
		try {
		tyreRepo.delete(carNum);
		}
		catch(Exception ex) {
			throw new Exception(ex.getMessage());
		}
		return "deleted successfully";
	}

	
	
}

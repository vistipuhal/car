package com.tata.tms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tata.tms.dto.CarData;

@RestController
@RequestMapping("tms")
public class TyreController {

	@Autowired
	TyreService tyreService;

	@RequestMapping(value = "/findCarByName/{name}", method = RequestMethod.GET)
	public List<CarData> findCarByName(@PathVariable("name") String num) throws Exception{
		
		return tyreService.findCarByName(num);
	}
	@RequestMapping(value = "/findCarByManufactName/{manufactName}", method = RequestMethod.GET)
	public List<CarData> findCarByManufactName(@PathVariable("manufactName") String num) throws Exception{
		
		return tyreService.findCarByManufactName(num);
	}
	@RequestMapping(value = "/findCarByModel/{model}", method = RequestMethod.GET)
	public List<CarData> findCarByModel(@PathVariable("model") String num) throws Exception{
		
		return tyreService.findCarByModel(num);
	}
	@RequestMapping(value = "/findCarByYear/{year}", method = RequestMethod.GET)
	public List<CarData> findCarByYear(@PathVariable("year") String num) throws Exception{
		
		return tyreService.findCarByYear(num);
	}
	@RequestMapping(value = "/findCarByColor/{color}", method = RequestMethod.GET)
	public List<CarData> findCarByColor(@PathVariable("color") String num)throws Exception{
		
		return tyreService.findCarByColor(num);
	}

	@RequestMapping(value = "/addCar", method = RequestMethod.GET)
	public String addCar(CarData car) throws Exception{
		return tyreService.addCar(car);
	}

	@RequestMapping(value = "/addCar", method = RequestMethod.GET)
	public String updateCar(CarData car) throws Exception{
		return tyreService.updateCar(car);
	}
	
	@RequestMapping(value = "/deleteCar/{carNum}", method = RequestMethod.GET)
	public String deleteCar(@PathVariable("carNum") String num) throws Exception{
		return tyreService.deleteCar(num);
	}
	

	
}

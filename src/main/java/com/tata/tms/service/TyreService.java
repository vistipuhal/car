package com.tata.tms.service;

import com.tata.tms.dto.BusData;
import com.tata.tms.dto.TyreData;

public interface TyreService {

	public String addTyre(TyreData tyre);
	
	public String addBus(BusData bus);
	
	public String updateTyre(TyreData tyre);

	public String updateBus(BusData bus);

	public TyreData findTyre(String tyreNum);

	public BusData findBus(String busNum);

	public String deleteBus(String busNum);

	public String deleteTyre(String tyreNum);


}

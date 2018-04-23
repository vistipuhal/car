package com.tata.tms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tata.tms.dto.BusData;
import com.tata.tms.dto.TyreData;
import com.tata.tms.dao.BusRepo;
import com.tata.tms.dao.TyreRepo;

@Service
public class TyreServiceImpl implements TyreService{

	@Autowired
	TyreRepo tyreRepo;

	@Autowired
	BusRepo busRepo;
	
	
	
	
	
	@Override
	public String addTyre(TyreData tyre) {
		// TODO Auto-generated method stub
		System.out.println(tyre.toString());

		if( (boolean)busRepo.exists( tyre.getBusNum() ) ){
			System.out.println("exists");
			tyreRepo.save(tyre);
			BusData bus = new BusData();
			bus = busRepo.findOne(tyre.getBusNum());
			tyreAdd(bus,tyre);
			busRepo.save(bus);
		}
		else{
			BusData bus = new BusData();
			bus.setBusNum(tyre.getBusNum());
			tyreAdd(bus , tyre);
			System.out.println(bus.toString());
			addBus(bus);
			tyreRepo.save(tyre);
		}
		return "Save";
	}

	//update bus data
	public void tyreAdd(BusData bus, TyreData tyre){
		if(tyre.getBusPos().equals("fl"))
			bus.setTyreFl(tyre.getTyreNum());
		else if(tyre.getBusPos().equals("fr") )
			bus.setTyreFr(tyre.getTyreNum()); 
		else if(tyre.getBusPos().equals("rrr"))
			bus.setTyreRrr(tyre.getTyreNum()); 
		else if(tyre.getBusPos().equals("rrl"))
			bus.setTyreRrl(tyre.getTyreNum());
		else if(tyre.getBusPos().equals("rlr"))
			bus.setTyreRlr(tyre.getTyreNum()); 
		else if(tyre.getBusPos().equals("rll"))
			bus.setTyreRll(tyre.getTyreNum()); 
	}
	
	@Override
	public String addBus(BusData bus) {
		// TODO Auto-generated method stub
		busRepo.save(bus);
		return "save";
	}

	@Override
	public String updateTyre(TyreData tyre) {
		// TODO Auto-generated method stub
		tyreRepo.save(tyre);
		return "update tyre";
	}

	@Override
	public String updateBus(BusData bus) {
		// TODO Auto-generated method stub
		busRepo.save(bus);
		return "update bus";
	}

	@Override
	public TyreData findTyre(String tyreNum) {
		// TODO Auto-generated method stub
		return tyreRepo.findOne(tyreNum);
	}

	@Override
	public BusData findBus(String busNum) {
		// TODO Auto-generated method stub
		return busRepo.findOne(busNum);
	}

	@Override
	public String deleteBus(String busNum) {
		// TODO Auto-generated method stub
		if( (boolean)busRepo.exists( busNum ) ){
		BusData bus = busRepo.findOne(busNum);
		TyreData tyre = new TyreData();
		
		if(bus.getTyreFl() != null){
			if( (boolean)tyreRepo.exists( bus.getTyreFl() ) ){
			tyre = tyreRepo.findOne(bus.getTyreFl());
			tyre.setBusNum(null);
			updateTyre(tyre);
			}
		}
		if(bus.getTyreFr() != null){
			if( (boolean)tyreRepo.exists( bus.getTyreFr() ) ){
			tyre = tyreRepo.findOne(bus.getTyreFr());
			tyre.setBusNum(null);
			updateTyre(tyre);			
			}
		}
		if(bus.getTyreRrl() != null){
			if( (boolean)tyreRepo.exists( bus.getTyreRrl() ) ){
			tyre = tyreRepo.findOne(bus.getTyreRrl());
			tyre.setBusNum(null);
			updateTyre(tyre);			
			}
		}
		if(bus.getTyreRrr() != null){
			if( (boolean)tyreRepo.exists( bus.getTyreRrr() ) ){
			tyre = tyreRepo.findOne(bus.getTyreRrr());
			tyre.setBusNum(null);
			updateTyre(tyre);			
			}
		}
		if(bus.getTyreRlr() != null){
			if( (boolean)tyreRepo.exists( bus.getTyreRlr() ) ){
			tyre = tyreRepo.findOne(bus.getTyreRlr());
			tyre.setBusNum(null);
			updateTyre(tyre);			
			}
		}
		if(bus.getTyreRll() != null){
			if( (boolean)tyreRepo.exists( bus.getTyreRll() ) ){
			tyre = tyreRepo.findOne(bus.getTyreRll());
			tyre.setBusNum(null);
			updateTyre(tyre);			
			}
		}
		busRepo.delete(busNum);
		
		return "bus delete";
		}
		else{
		return "bus not exist";	
		}
	}

	@Override
	public String deleteTyre(String tyreNum) {
		// TODO Auto-generated method stub
		BusData bus = (busRepo.findOne(tyreRepo.findOne(tyreNum).getBusNum()));
		TyreData tyre = tyreRepo.findOne(tyreNum);
		String tyrePos = tyre.getBusPos();

		if(tyrePos.equals("fr")){
			bus.setTyreFr(null);
		}
		else if(tyrePos.equals("fl")){
			bus.setTyreFl(null);
		}
		else if(tyrePos.equals("rrr")){
			bus.setTyreRrr(null);
		}
		if(tyrePos.equals("rrl")){
			bus.setTyreRrl(null);
		}
		if(tyrePos.equals("rll")){
			bus.setTyreRll(null);
		}
		if(tyrePos.equals("rlr")){
			bus.setTyreRlr(null);
		}
		
		tyreRepo.delete(tyreNum);
		
		return "tyre delete";
	}

	
	
}

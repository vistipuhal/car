package com.tata.tms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tata.tms.dto.BusData;
import com.tata.tms.dto.TyreData;

@RestController
@RequestMapping("tms")
public class TyreController {

	@Autowired
	TyreService tyreService;
	
	@RequestMapping(value = "/addTyre", method = RequestMethod.POST)
	public String addTyre(@RequestBody TyreData tyre) /*throws exception*/{
		tyreService.addTyre(tyre);
		return "msg here";
	}

	@RequestMapping(value = "/findTyre/{tyreNum}", method = RequestMethod.GET)
	public TyreData findTyre(@PathVariable("tyreNum") String num) /*throws exception*/{
		System.out.println("service API invoked");
		return tyreService.findTyre(num);
	}
	
	@RequestMapping(value = "/updateTyre", method = RequestMethod.POST)
	public String updateTyre(@RequestBody TyreData tyre) /*throws exception*/{
		tyreService.updateTyre(tyre);
		return "msg here";
	}

	@RequestMapping(value = "/addBus", method = RequestMethod.POST)
	public String addBus(@RequestBody BusData bus) /*throws exception*/{		
		tyreService.addBus(bus);
		return "msg bus";
	}
	
	@RequestMapping(value = "/findBus/{busNum}", method = RequestMethod.GET)
	public BusData findBus(@PathVariable("busNum") String num) /*throws exception*/{
		
		return tyreService.findBus(num);
	}

	
	@RequestMapping(value = "/deleteTyre/{tyreNum}", method = RequestMethod.GET)
	public String updateTyre(@PathVariable("tyreNum") String num) /*throws exception*/{
		tyreService.deleteTyre(num);
		return "delete tyre";
	}
	
	@RequestMapping(value = "/deleteBus/{busNum}", method = RequestMethod.GET)
	public String updateBus(@PathVariable("busNum") String num) /*throws exception*/{
		tyreService.deleteBus(num);
		return "deletebus";
	}

}

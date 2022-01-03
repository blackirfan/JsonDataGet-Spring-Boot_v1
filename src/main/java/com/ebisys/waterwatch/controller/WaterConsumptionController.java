package com.ebisys.waterwatch.controller;

import com.ebisys.waterwatch.model.WaterConsumption;
import com.ebisys.waterwatch.service.WaterConsumptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/waterconsumption")
public class WaterConsumptionController {
	
	@Autowired
	private WaterConsumptionService waterConsumptionService;
	
	@GetMapping
	public List<WaterConsumption> findAll() {
		return waterConsumptionService.findAll();
	}
	
	@GetMapping(path = "/topten")
	public List<WaterConsumption> findTopTenConsumers() {
		return waterConsumptionService.findTopTenConsumers();
	}
}

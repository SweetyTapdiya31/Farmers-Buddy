package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.Farmer;
import com.lti.entity.crop.FarmerCropSell;
import com.lti.service.FarmerService;

@RestController
public class FarmerController {

		@Autowired
		private FarmerService farmerService;
		
		@RequestMapping(path="/farmer/add", method=RequestMethod.POST)
		@CrossOrigin
		public String add(@RequestBody Farmer farmer) {
			farmerService.add(farmer);
			return "{\"status\" : \"Congratulations Your Have Registered Successfully!!\"}";
		}
		
		@RequestMapping(path="/farmerCrop/add", method=RequestMethod.POST)
		@CrossOrigin
		public String addCrop(@RequestBody FarmerCropSell farmerCrop) {
			farmerService.addCrop(farmerCrop);
			return "{\"status\" : \" Your records have been inserted Successfully!!\"}";
		}
	
}

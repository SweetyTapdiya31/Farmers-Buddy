package com.lti.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.FarmerDao;
import com.lti.entity.Farmer;

@Service
public class FarmerService {

	@Autowired
	private FarmerDao farmerDao;

	@Transactional
	public void add(Farmer farmer) {
		farmerDao.add(farmer);
	}

	
	
	
	
	}

	                                  



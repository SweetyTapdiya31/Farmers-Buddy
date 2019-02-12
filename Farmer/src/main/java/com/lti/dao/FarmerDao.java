package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lti.entity.Farmer;
import com.lti.entity.crop.FarmerCropSell;

@Repository
public class FarmerDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	public void add(Farmer farmer) {
		entityManager.merge(farmer);
	}
	public void addCrop(FarmerCropSell farmerCrop) {
		entityManager.merge(farmerCrop);
	}
	public Farmer fetch(int id)
	{
	return entityManager.find(Farmer.class, id);	
	}

}

package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lti.entity.Farmer;

@Repository
public class FarmerDao {

	@PersistenceContext
	private EntityManager entityManager;
	public void add(Farmer farmer) {
		entityManager.merge(farmer);
	}
	public Farmer fetch(int id)
	{
	return entityManager.find(Farmer.class, id);	
	}

}

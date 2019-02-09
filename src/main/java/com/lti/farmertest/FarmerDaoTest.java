package com.lti.farmertest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import javax.transaction.Transactional;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import com.lti.dao.FarmerDao;
import com.lti.entity.Farmer;
import com.lti.farmer.FarmerApplication;

 @RunWith(SpringRunner.class)
	@SpringBootTest(classes = FarmerApplication.class)
	@Rollback(false)
   @AutoConfigureTestDatabase(replace=Replace.NONE)
	public class FarmerDaoTest {
		@Autowired
		private FarmerDao farmerDao;
		@Test
		@Transactional
		public void addFarmer() {
			Farmer farmer = new Farmer();
			farmer.setAccno(1236869781);
			farmer.setIfsccode("sc123");
			farmer.setAddress("Mahape");
			farmer.setCity("Mumbai");
			farmer.setState("Maharashtra");
			farmer.setPincode(2345);
			farmer.setName("Misha");
			farmer.setPassword("123456");
			farmer.setPassword("123456");
			farmer.setEmail("Misha@gmail.com");
			 farmerDao.add(farmer);	
		}
		
		@Test
		@Transactional
		public void fetchFarmerData() {
			Farmer farmer=new Farmer();
		farmer =	farmerDao.fetch(1);
			System.out.println(farmer.getCity());
			
			}
 }
	


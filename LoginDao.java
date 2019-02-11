package com.lti.Dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;


import com.lti.Entity.Login;


@Repository  
public class LoginDao {

	@PersistenceContext
	private EntityManager entitymanager;
	
	@Transactional
	public void add(Login login)
	{
		entitymanager.persist(login);
		
	}
	
	@Transactional
	public Login fetch(int id)
{
return entitymanager.find(Login.class, id);	
}
	@Transactional
	public List<Login> fetchAll(){
		Query q= entitymanager.createQuery("select obj from Login as obj");
		return q.getResultList();
	}

}

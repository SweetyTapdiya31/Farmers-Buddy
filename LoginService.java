package com.lti.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.Dao.BidderDao;
import com.lti.Dao.LoginDao;
import com.lti.Entity.Bidder;
import com.lti.Entity.Login;

import org.springframework.beans.factory.annotation.Autowired;
@Service
public class LoginService {
	@Autowired
	private LoginDao loginDao;
	
	@Transactional
	public void add(Login login) {
		loginDao.add(login);

	}
	
	public Login fetch(int id) {
		return loginDao.fetch(id);
	}

}

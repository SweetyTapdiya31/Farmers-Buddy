package com.lti.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.Dao.LoginDao;
import com.lti.Entity.Bidder;
import com.lti.Entity.Login;
import com.lti.Service.BidderService;
import com.lti.Service.LoginService;





@RestController
@CrossOrigin
public class LoginController {
	@Autowired(required=true)
	private LoginService loginService;
	
	@Autowired(required=true)
	private LoginDao loginDao;
	
	
	@CrossOrigin
	@RequestMapping(path="/login/add", method=RequestMethod.POST)
	public String add(@RequestBody Login login) {
		Login login1=new Login();
		String email=login1.getEmailId();
		String password=login1.getPassword();
		boolean flag=false;
		List<Login> loginList=loginDao.fetchAll();
		
		for( Login login2:loginList) {
			if(email.equals(login2.getEmailId())) {
				if(password.equals(login2.getPassword())) {
					 flag=true;
					
					 return "{\"status\" : \"Login successfull!\"}";
				}
				else {
					
				}
			}
		}
		return "{\"status\" : \"Please try again!\"}" ;
		}
		
		
		//return "Bidder record created successfully!";
		
	
	@RequestMapping(path="/login/{id}", method=RequestMethod.GET)
	public Login fetch(@PathVariable("id") int id) {
		return loginService.fetch(id);
		
	}


}

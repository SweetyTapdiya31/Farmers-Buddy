package com.lti.farmer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.lti"})
@ComponentScan(basePackages = {"com.lti"})
public class FarmerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FarmerApplication.class, args);
	}

}


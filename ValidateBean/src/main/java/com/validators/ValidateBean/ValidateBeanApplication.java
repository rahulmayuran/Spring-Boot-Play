package com.validators.ValidateBean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ValidateBeanApplication {

	public static void main(String[] args) {
		SpringApplication.run(ValidateBeanApplication.class, args);
	}

}

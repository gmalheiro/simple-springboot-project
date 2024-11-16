package com.simple.springboot.project.springboot_simple_project.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simple.springboot.project.springboot_simple_project.configuration.AuthServiceConfiguration;

@RestController
public class AuthController {

	@Autowired
	private AuthServiceConfiguration configuration;
	
	
	
	public AuthController(AuthServiceConfiguration configuration) {
		super();
		this.configuration = configuration;
	}

	@RequestMapping("/auth-configuration")
	public AuthServiceConfiguration retrieveConfiguration() {
		return configuration;
	}
}

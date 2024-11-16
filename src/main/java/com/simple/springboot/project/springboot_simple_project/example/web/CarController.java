package com.simple.springboot.project.springboot_simple_project.example.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simple.springboot.project.springboot_simple_project.entity.Car;
import com.simple.springboot.project.springboot_simple_project.example.business.CarBusiness;

@RestController
public class CarController {

	@Autowired
	private CarBusiness business;
	
	public CarController(CarBusiness business) {
		super();
		this.business = business;
	}



	@RequestMapping("/cars")
	public List<Car> retrieveAllCars() {
		return business.retrieveAllCars();
	}
}

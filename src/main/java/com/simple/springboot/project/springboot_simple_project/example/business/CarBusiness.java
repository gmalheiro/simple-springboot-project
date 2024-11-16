package com.simple.springboot.project.springboot_simple_project.example.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.simple.springboot.project.springboot_simple_project.entity.Car;
import com.simple.springboot.project.springboot_simple_project.example.data.CarData;

@Component
public class CarBusiness {

	@Autowired
	private CarData data;

	public CarBusiness(CarData data) {
		super();
		this.data = data;
	}
	
	public List<Car> retrieveAllCars() {
		return data.retrieveAllCourses();
	}
	
}

package com.simple.springboot.project.springboot_simple_project.example.data;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.simple.springboot.project.springboot_simple_project.entity.Car;

@Component
public class CarData {

	public List<Car> retrieveAllCourses() {
		return Arrays.asList(
				new Car(1,"Toyota","Corolla"),
				new Car(2,"Chevrolet", "Camaro"),
				new Car(3,"Nissan","Versa"));
	}
}

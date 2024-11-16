package com.simple.springboot.project.springboot_simple_project.entity;

public class Car {

	private long id;
	private String brand;
	private String name;
	
	public Car(long id, String brand, String name) {
		super();
		this.id = id;
		this.brand = brand;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public String getBrand() {
		return brand;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", brand=" + brand + ", name=" + name + "]";
	}
	
	
}

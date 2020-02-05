package com.springboot.app.model;

public class Employee {
	
	private Integer Id;
	private String Name;
	private String City;
	
	public Employee(){}

	public Employee(Integer id, String name, String city) {
		super();
		Id = id;
		Name = name;
		City = city;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}
	
	

}

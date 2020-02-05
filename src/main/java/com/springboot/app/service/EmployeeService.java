package com.springboot.app.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.app.model.Employee;

@Service
public class EmployeeService {
	
	private List<Employee> li = new ArrayList <>( Arrays.asList(
			new Employee(1,"Abhishek","Pune"),
			new Employee(2,"Madhur","Banglore"),
			new Employee(3,"Shruti","Pune")
			));
	
	
	public List<Employee> getAllTopics()
	{
		return li;
	}

	public Employee getEmployee(int id)
	{
		 
		 return li.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addEmployee(Employee emp) {
	  li.add(emp);
		
	}

	public void updateEmployee(Integer id, Employee emp) {
		
		for(int i=0;i<li.size();i++)
		{
			Employee e=li.get(i);
			if(e.getId().equals(id))
			{
				li.set(i, emp);
				return;
			}
		}
		
	}

	public void deleteEmployee(Integer id) {
		
		li.removeIf(t -> t.getId().equals(id));
		
	}
}

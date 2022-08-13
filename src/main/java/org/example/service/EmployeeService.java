package org.example.service;

import org.example.entity.Employee;

import java.util.List;

public interface EmployeeService {
	
	List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee employee);
	
	void delete(int id); 
}

package com.example.angulardemo.service;

import java.util.Map;
import java.util.Optional;

import com.example.angulardemo.entity.Employee;

public interface EmployeeService {

	public Iterable<Employee> getEmployee();
	public Employee createEmployee(Employee employee);
	public Optional<Employee> getEmployeeById(Long id);
	public Employee updateEmployee(Long id, Employee employeeDetails);
	public Map<String, Boolean> deleteEmployee(Long id);
}

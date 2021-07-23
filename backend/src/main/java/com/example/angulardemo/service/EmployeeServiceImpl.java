package com.example.angulardemo.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.angulardemo.entity.Employee;
import com.example.angulardemo.entity.EmployeeRepository;
import com.example.angulardemo.exception.ResourceNotFoundException;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepository employeeRepository;
	
	public Iterable<Employee> getEmployee(){
		return employeeRepository.findAll();
	}
	
	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	public Optional<Employee> getEmployeeById(Long id){
		return employeeRepository.findById(id);
	}
	
	public Employee updateEmployee(Long id, Employee employeeDetails) {
		Optional<Employee> optional = employeeRepository.findById(id);
		if(optional!=null) {
			Employee employee = optional.get();
			employee.setFirstName(employeeDetails.getFirstName());
			employee.setLastName(employeeDetails.getLastName());
			employee.setEmailId(employeeDetails.getEmailId());
			return employeeRepository.save(employee);
		}
		
		return null;
	}
	
	public Map<String, Boolean> deleteEmployee(Long id){
		Optional<Employee> optional = employeeRepository.findById(id);
		Employee employee = optional.get();
		employeeRepository.delete(employee);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}

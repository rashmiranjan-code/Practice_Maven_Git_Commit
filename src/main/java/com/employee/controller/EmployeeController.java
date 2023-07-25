package com.employee.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.Employee;
import com.employee.service.EmployeeServiceImpl;

@RestController
public class EmployeeController {
	private EmployeeServiceImpl employeeServiceImpl;
	 @PostMapping
	public Employee updateEmployee(@RequestBody Employee employee) {
		 Employee updateEmp = employeeServiceImpl.updateEmp(employee);
		return updateEmp;
		
	}

}

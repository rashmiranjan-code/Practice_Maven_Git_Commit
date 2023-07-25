package com.employee.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepo;

public class EmployeeServiceImpl implements EmployeeService {
@Autowired
 private EmployeeRepo employeeRepo;
	@Override
	public Employee updateEmp(Employee employee) {
		Employee isUpdated=null;
		if(employeeRepo.getById(employee.getEmpId()) != null) {
			 isUpdated = employeeRepo.save(employee);
			
		}
		// TODO Auto-generated method stub
		
		return isUpdated;
	}
	
	
	

}

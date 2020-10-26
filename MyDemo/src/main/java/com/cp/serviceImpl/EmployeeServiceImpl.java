package com.cp.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cp.pojo.EmployeePojo;
import com.cp.repository.EmployeeRepository;
import com.cp.service.EmployeeService;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public EmployeePojo createUser(EmployeePojo pojo) {
		EmployeePojo emp = employeeRepository.createUser(pojo);
		return emp;
		
		
	}

}

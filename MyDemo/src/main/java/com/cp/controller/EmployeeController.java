package com.cp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cp.pojo.EmployeePojo;
import com.cp.service.EmployeeService;

@RestController
public class EmployeeController {
	
@Autowired	
private EmployeeService employeeService;

@RequestMapping(value="/save", method= RequestMethod.POST)

public ResponseEntity<EmployeePojo> createUser(@RequestBody EmployeePojo pojo)
{
	EmployeePojo emp = employeeService.createUser(pojo);
	if(emp !=null)
	{
		emp.setId(pojo.getId());
		emp.setFirstName(pojo.getFirstName());
		emp.setLastName(pojo.getLastName());
		emp.setContact(pojo.getContact());
		emp.setAddress(pojo.getAddress());
		
		
	}
	
	
	return new ResponseEntity<EmployeePojo>(emp,HttpStatus.CREATED);
	

}

}

package com.onetomany.OnetoManyMapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onetomany.OnetoManyMapping.entity.Employee;
import com.onetomany.OnetoManyMapping.entity.Phone;
import com.onetomany.OnetoManyMapping.service.EmployeeService;

@RestController
@RequestMapping(value = "/")
public class WebController {

	@Autowired
	EmployeeService service;

	@PostMapping(value = "save")
	public ResponseEntity<Employee> getDetails(@RequestBody Employee emp) {
		Employee ph = service.addInfo(emp);
		return new ResponseEntity<Employee>(ph, HttpStatus.CREATED);

	}

	@GetMapping(value = "getDetails")

	public ResponseEntity<List<Employee>> getDetails() {
		List<Employee> detail = service.getAll();

		return new ResponseEntity<List<Employee>>(detail, HttpStatus.FOUND);

	}

}

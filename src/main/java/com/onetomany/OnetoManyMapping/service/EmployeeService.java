package com.onetomany.OnetoManyMapping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.onetomany.OnetoManyMapping.entity.Employee;
import com.onetomany.OnetoManyMapping.entity.Phone;
import com.onetomany.OnetoManyMapping.repo.EmployeeRepo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class EmployeeService {

	@Autowired
	EmployeeRepo repo;
	String ok;

	public Employee addInfo(Employee emp) {
		log.info("save Info");
		Employee ph = repo.save(emp);
		return ph;

	}

	public List<Employee> getAll() {
		List<Employee> list = repo.findAll();

		return list;
	}

}

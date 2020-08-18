package com.onetomany.OnetoManyMapping.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onetomany.OnetoManyMapping.entity.Employee;
import com.onetomany.OnetoManyMapping.entity.Phone;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}

package com.quintrix.mdbExample.repository;


import com.quintrix.mdbExample.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface EmployeeRepository extends MongoRepository<Employee, Integer> {

}
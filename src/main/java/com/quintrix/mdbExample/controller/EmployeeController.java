package com.quintrix.mdbExample.controller;


import com.quintrix.mdbExample.model.Employee;
import com.quintrix.mdbExample.repository.EmployeeRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

  @Autowired
  private EmployeeRepository repository;

  @PostMapping("/add")
  public String postEmp(@RequestBody Employee emp) {
    repository.save(emp);
    return "Added Employee with id : " + emp.getId();
  }

  @GetMapping("/find")
  public List<Employee> getEmps() {
    return repository.findAll();
  }

  @GetMapping("/find/{id}")
  public Optional<Employee> getEmp(@PathVariable int id) {
    return repository.findById(id);
  }

  @DeleteMapping("/delete/{id}")
  public String delEmp(@PathVariable int id) {
    repository.deleteById(id);
    return "Employee deleted with id : " + id;
  }



}

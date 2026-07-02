package com.example.springdatajpa.controller;
import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.example.springdatajpa.entity.Employee;
import com.example.springdatajpa.repository.EmployeeRepository;
@RestController
@RequestMapping("/employees")
public class EmployeeController{
 private final EmployeeRepository repo;
 public EmployeeController(EmployeeRepository repo){this.repo=repo;}
 @GetMapping public List<Employee> all(){return repo.findAll();}
 @PostMapping public Employee add(@RequestBody Employee e){return repo.save(e);}
}
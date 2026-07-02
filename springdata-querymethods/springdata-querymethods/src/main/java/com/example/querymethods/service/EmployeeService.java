package com.example.querymethods.service;
import com.example.querymethods.entity.Employee;import com.example.querymethods.repository.EmployeeRepository;import org.springframework.stereotype.Service;import java.time.LocalDate;import java.util.List;
@Service public class EmployeeService{
private final EmployeeRepository r; public EmployeeService(EmployeeRepository r){this.r=r;}
public List<Employee> contains(String t){return r.findByNameContaining(t);}
public List<Employee> starts(String t){return r.findByNameStartingWith(t);}
public List<Employee> between(LocalDate s,LocalDate e){return r.findByJoiningDateBetween(s,e);}
public List<Employee> greater(double s){return r.findBySalaryGreaterThan(s);}
public List<Employee> less(double s){return r.findBySalaryLessThan(s);}
public List<Employee> top(){return r.findTop3ByOrderBySalaryDesc();}
public List<Employee> sorted(String t){return r.findByNameContainingOrderBySalaryAsc(t);}
}
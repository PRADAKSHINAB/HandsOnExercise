package com.example.querymethods.controller;
import com.example.querymethods.entity.Employee;import com.example.querymethods.service.EmployeeService;import org.springframework.web.bind.annotation.*;import java.time.LocalDate;import java.util.List;
@RestController @RequestMapping("/employees")
public class EmployeeController{
private final EmployeeService s; public EmployeeController(EmployeeService s){this.s=s;}
@GetMapping("/contains/{t}") public List<Employee> c(@PathVariable String t){return s.contains(t);}
@GetMapping("/starts/{t}") public List<Employee> st(@PathVariable String t){return s.starts(t);}
@GetMapping("/greater/{v}") public List<Employee> g(@PathVariable double v){return s.greater(v);}
@GetMapping("/less/{v}") public List<Employee> l(@PathVariable double v){return s.less(v);}
@GetMapping("/top") public List<Employee> top(){return s.top();}
@GetMapping("/sorted/{t}") public List<Employee> so(@PathVariable String t){return s.sorted(t);}
@GetMapping("/between") public List<Employee> b(@RequestParam String start,@RequestParam String end){return s.between(LocalDate.parse(start),LocalDate.parse(end));}
}
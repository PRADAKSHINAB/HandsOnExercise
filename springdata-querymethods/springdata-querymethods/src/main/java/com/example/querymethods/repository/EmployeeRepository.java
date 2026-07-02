package com.example.querymethods.repository;
import com.example.querymethods.entity.Employee;import org.springframework.data.jpa.repository.JpaRepository;import java.time.LocalDate;import java.util.List;
public interface EmployeeRepository extends JpaRepository<Employee,Long>{
List<Employee> findByNameContaining(String t);
List<Employee> findByNameStartingWith(String t);
List<Employee> findByJoiningDateBetween(LocalDate s,LocalDate e);
List<Employee> findBySalaryGreaterThan(Double s);
List<Employee> findBySalaryLessThan(Double s);
List<Employee> findTop3ByOrderBySalaryDesc();
List<Employee> findByNameContainingOrderBySalaryAsc(String t);
}
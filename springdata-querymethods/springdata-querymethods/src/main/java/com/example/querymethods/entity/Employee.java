package com.example.querymethods.entity;
import jakarta.persistence.*;import java.time.LocalDate;
@Entity public class Employee{
@Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
private String name; private Double salary; private LocalDate joiningDate;
public Long getId(){return id;} public void setId(Long id){this.id=id;}
public String getName(){return name;} public void setName(String n){name=n;}
public Double getSalary(){return salary;} public void setSalary(Double s){salary=s;}
public LocalDate getJoiningDate(){return joiningDate;} public void setJoiningDate(LocalDate d){joiningDate=d;}
}
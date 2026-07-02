
package com.example.orm.entity;
import jakarta.persistence.*;import java.util.*;
@Entity
public class Employee{
@Id @GeneratedValue(strategy=GenerationType.IDENTITY) Long id;
String name;
@ManyToOne(fetch=FetchType.EAGER)
@JoinColumn(name="department_id")
Department department;

@ManyToMany(fetch=FetchType.LAZY)
@JoinTable(name="employee_project",
joinColumns=@JoinColumn(name="employee_id"),
inverseJoinColumns=@JoinColumn(name="project_id"))
Set<Project> projects=new HashSet<>();
}

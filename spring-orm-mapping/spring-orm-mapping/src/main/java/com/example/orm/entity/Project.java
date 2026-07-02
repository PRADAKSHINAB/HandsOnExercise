
package com.example.orm.entity;
import jakarta.persistence.*;import java.util.*;
@Entity
public class Project{
@Id @GeneratedValue(strategy=GenerationType.IDENTITY) Long id;
String title;
@ManyToMany(mappedBy="projects")
Set<Employee> employees=new HashSet<>();
}

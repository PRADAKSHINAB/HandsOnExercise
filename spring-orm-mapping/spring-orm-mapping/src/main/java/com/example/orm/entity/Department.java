
package com.example.orm.entity;
import jakarta.persistence.*;import java.util.*;
@Entity
public class Department{
@Id @GeneratedValue(strategy=GenerationType.IDENTITY) Long id;
String name;
@OneToMany(mappedBy="department",fetch=FetchType.LAZY)
List<Employee> employees=new ArrayList<>();
}

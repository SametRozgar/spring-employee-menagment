package com.example.employee_menagment.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "departments")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (unique = true,nullable = false)
    private String name;

    private String description;

    @OneToMany(mappedBy = "department")
    private List<Employee> employees;

}

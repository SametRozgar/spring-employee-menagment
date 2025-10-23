package com.example.employee_menagment.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false,unique = true)
    private  String email;

    private String department;
    private String position;
    private Double salary;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;

    @Column(name = "hire_date")
    private LocalDateTime hireDate;

    @PrePersist
    protected void onCreate (){
        hireDate=LocalDateTime.now();
    }
}

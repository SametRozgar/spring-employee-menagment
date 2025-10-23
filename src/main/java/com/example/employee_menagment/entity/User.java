package com.example.employee_menagment.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,unique = true)
    private String username;

    @Column(nullable = false,unique = true)
    private String email;

    private String firstName;
    private String lastName;

    @Enumerated(EnumType.STRING)
    private Role role;

    public enum Role{
        ROLE_USER,ROLE_ADMIN
    }

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Employee> employees;
}

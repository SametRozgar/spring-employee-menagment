package com.example.employee_menagment.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name="users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (unique = true,nullable = false)
    private String userName;

    @Column(unique = true,nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    private String firstName;
    private String lastName;

    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Employee> employees;

    public enum Role{
        ROLE_USER,ROLE_ADMIN
    }
}

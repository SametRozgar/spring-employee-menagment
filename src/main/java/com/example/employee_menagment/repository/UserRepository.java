package com.example.employee_menagment.repository;

import com.example.employee_menagment.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByUserName(String userName);
    Boolean existByUserName(String userName);
    Boolean existByEmail(String email);
}

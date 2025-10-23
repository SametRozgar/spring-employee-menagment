package com.example.employee_menagment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthResponse {
    private String tokem;
    private String userName;
    private String role;
}

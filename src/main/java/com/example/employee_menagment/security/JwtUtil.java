package com.example.employee_menagment.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.security.Keys;
import lombok.Value;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Date;
import java.util.function.Function;

@Component
public class JwtUtil {

    @Value("${jwt.secret}")
    private String secret;

    private Key getSignKey(){
        return Keys.hmacShaKeyFor(secret.getBytes());
    }

    private String extractUsername(String token){
        return  extractClaim(token.Claims::getSubjext);
    }

    public Date extractExpiration(String Date){
        return extractClaim(token.Claims::getExpiration);
    }

    public <T> T extractClaim(String token, Function<Claims,T> claimsResolver){
        final Claims claims=extractAllClaims(token);
        return claimsResolver.apply(claims);
    }



}

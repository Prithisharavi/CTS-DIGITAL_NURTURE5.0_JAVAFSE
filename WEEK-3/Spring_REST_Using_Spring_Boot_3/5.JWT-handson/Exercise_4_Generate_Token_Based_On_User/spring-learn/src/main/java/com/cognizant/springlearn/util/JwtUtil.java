package com.cognizant.springlearn.util;

import java.security.Key;
import java.util.Date;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

public class JwtUtil {

    private static final Key KEY =
            Keys.hmacShaKeyFor(
                    "mysecretkeymysecretkeymysecretkey12"
                            .getBytes());

    public static Key getSigningKey() {

        return KEY;
    }

    public static String generateToken(String username) {

        return Jwts.builder()

                .setSubject(username)

                .setIssuedAt(new Date())

                .setExpiration(
                        new Date(System.currentTimeMillis()
                                + 1200000))

                .signWith(KEY, SignatureAlgorithm.HS256)

                .compact();

    }

}
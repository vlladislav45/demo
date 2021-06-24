package com.example.demo.controllers;

import models.AuthRequestBody;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TestController {
    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody AuthRequestBody authRequestBody) {
        System.out.println(authRequestBody.getUsername());
        System.out.println(authRequestBody.getPass());
        // Look for this body
        if(authRequestBody.getUsername().equals("a"))
            System.out.println("It's TRUE");

        return ResponseEntity.ok().body(Map.of("registered", authRequestBody));
    }
}

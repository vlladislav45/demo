package com.example.demo.models;

public class AuthRequestBody {
    private final String username;
    private final String pass;

    public AuthRequestBody(String username, String pass) {
        this.username = username;
        this.pass = pass;
    }

    public String getUsername() {
        return username;
    }

    public String getPass() {
        return pass;
    }
}

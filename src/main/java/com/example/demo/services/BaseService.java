package com.example.demo.services;

public interface BaseService<T> {
    void add(Object object);

    T getById(int id); // get by user id
}

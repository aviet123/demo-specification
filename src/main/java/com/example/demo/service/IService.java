package com.example.demo.service;

import java.util.Optional;

public interface IService<T> {
    Iterable<T> findAll();
    Optional<T> findUserById(Long id);
    T save(T t);
    boolean remove(Long id);
}

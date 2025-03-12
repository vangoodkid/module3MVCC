package com.example.ss10.repository;

import com.example.ss10.model.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> findAll();
}
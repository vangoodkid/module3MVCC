package com.example.ss10.service;

import com.example.ss10.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
}
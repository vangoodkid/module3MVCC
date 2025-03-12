package com.example.ss10.service;

import com.example.ss10.model.Customer;
import com.example.ss10.repository.CustomerRepository;
import com.example.ss10.repository.ICustomerRepository;

import java.util.List;

public class CustomerService implements ICustomerService {
    private ICustomerRepository customerRepository = new CustomerRepository();

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
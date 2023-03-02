package com.example.demo.services;

import com.example.demo.entities.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService implements ICostumerService {
    @Autowired
    private CustomerRepository repository;
    @Override
    public List<Customer> getAll() {
        return (List<Customer>) repository.findAll();
    }
}

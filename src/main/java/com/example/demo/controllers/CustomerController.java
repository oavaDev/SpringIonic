package com.example.demo.controllers;

import com.example.demo.entities.Customer;
import com.example.demo.services.ICostumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private ICostumerService service;

    @GetMapping("/api/customers")
    public List<Customer> getAll() {
        return service.getAll();
    }

}

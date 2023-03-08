package com.example.demo.controllers;

import com.example.demo.entities.Customer;
import com.example.demo.services.ICostumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private ICostumerService service;

    @GetMapping("/api/customers")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Customer> getAll() {
        return service.getAll();
    }
    @GetMapping("/api/customers/{id}")
    public Customer getById(@PathVariable String id) {
        return service.getById(Long.parseLong(id));
    }

    @DeleteMapping("/api/customers/{id}")
    public void remove(@PathVariable String id) {
        service.remove(Long.parseLong(id));
    }
    @PostMapping("/api/customers")
    public void save(@RequestBody Customer customer) {
        service.save(customer);
    }

}

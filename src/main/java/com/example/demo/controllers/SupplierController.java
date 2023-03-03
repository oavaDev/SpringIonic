package com.example.demo.controllers;

import com.example.demo.entities.Supplier;
import com.example.demo.services.ISupplierInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SupplierController {
    @Autowired
    private ISupplierInterface service;

    @GetMapping("/api/supplier")
    public List<Supplier> getAll() {
        return service.getAll();
    }
    @GetMapping("/api/supplier/{id}")
    public Supplier getById(@PathVariable String id) {
        return service.getById(Long.parseLong(id));
    }

    @DeleteMapping("/api/supplier/{id}")
    public void remove(@PathVariable String id) {
        service.remove(Long.parseLong(id));
    }
    @PostMapping("/api/supplier")
    public void save(@RequestBody Supplier supplier) {
        service.save(supplier);
    }
}

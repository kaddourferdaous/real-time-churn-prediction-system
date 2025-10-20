package com.fstt.bigdata.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.fstt.bigdata.services.customer_services;
import com.fstt.bigdata.Entity.Customer;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/customers")

public class customer_controller {
        @Autowired
        private customer_services customerService;

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.findAllCustomers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable UUID id) {
        return customerService.findCustomerById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }


    }

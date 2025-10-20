package com.fstt.bigdata.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import  com.fstt.bigdata.repository.CustomerRepository;
import com.fstt.bigdata.Entity.Customer;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class customer_services {

        @Autowired
        private CustomerRepository CustomerRepository;

    public List<Customer> findAllCustomers() {
        return CustomerRepository.findAll();
    }
    public Optional<Customer> findCustomerById(UUID id) {
        return CustomerRepository.findById(id);
    }

    }


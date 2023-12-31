package com.Endava.EventTix.controller;

import com.Endava.EventTix.service.CustomerService;
import com.Endava.EventTix.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/customer")
public class CustomerController {

    private final CustomerService customerService;
    @Autowired
    public CustomerController (CustomerService customerService) {
        this.customerService = customerService;
    }
    @GetMapping
    public List<Customer> getCustomers(){
        return customerService.getCustomers();
    }
}

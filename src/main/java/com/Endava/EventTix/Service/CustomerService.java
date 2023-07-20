package com.Endava.EventTix.Service;
import com.Endava.EventTix.Persistance.CustomerRepository;
import com.Endava.EventTix.Model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;
    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getCustomers() {
        return (List<Customer>) customerRepository.findAll();
    }
}

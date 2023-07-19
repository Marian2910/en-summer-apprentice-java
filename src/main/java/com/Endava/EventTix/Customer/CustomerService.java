package com.Endava.EventTix.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    public List<Customer> getCustomers(){
        return List.of(new Customer(
                1,
                "Marian Mutu",
                "marian.mutu02@gmail.com"));
    }
}

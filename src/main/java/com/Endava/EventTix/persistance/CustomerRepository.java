package com.Endava.EventTix.persistance;

import com.Endava.EventTix.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    Customer getCustomerByCustomerID(int id);
}

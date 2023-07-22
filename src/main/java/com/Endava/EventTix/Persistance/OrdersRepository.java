package com.Endava.EventTix.Persistance;

import com.Endava.EventTix.Model.Orders;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersRepository extends CrudRepository<Orders, Integer> {
    List<Orders> findOrdersByCustomerID_CustomerID(Integer customerID);

}

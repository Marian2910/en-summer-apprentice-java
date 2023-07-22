package com.Endava.EventTix.Service;
import com.Endava.EventTix.Persistance.OrdersRepository;
import com.Endava.EventTix.Model.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService {
    private final OrdersRepository ordersRepository;
    @Autowired
    public OrdersService(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    public List<Orders> getOrdersByCustomerId(int customerId) {
        return ordersRepository.findOrdersByCustomerID_CustomerID(customerId);
    }
}

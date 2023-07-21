package com.Endava.EventTix.Service;
import com.Endava.EventTix.Model.Event;
import com.Endava.EventTix.Persistance.EventRepository;
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

    // Implement the logic to fetch orders by customerId
//    public List<Orders> getOrdersByCustomerId(int customerId) {
//        // in progress
//    }

    // Implement the logic to create an order
//    public Orders createOrder(int customerId, String eventId, String ticketCategoryId, int numberOfTickets) {
//        // in progress
//    }
    public List<Orders> getOrders() {
        return (List<Orders>) ordersRepository.findAll();
    }

}

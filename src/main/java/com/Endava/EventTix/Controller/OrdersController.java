package com.Endava.EventTix.Controller;

import com.Endava.EventTix.Model.Orders;
import com.Endava.EventTix.Service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/orders")
public class OrdersController {
    private final OrdersService ordersService;

    @Autowired
    public OrdersController(OrdersService ordersService) {
        this.ordersService = ordersService;
    }

    @GetMapping
    public List<Orders> getOrders() {
        return ordersService.getOrders();
    }

//    @PostMapping
//    public ResponseEntity<Map<String, Orders>> createOrder(@RequestBody OrdersRequest ordersRequest) {
//        // For simplicity, hardcode the customerId here
//        int customerId = 123; // Hardcoded customerId (as mentioned in the text)
//
//        Orders orders = orderService.createOrder(customerId, orderRequest.getEventId(),
//                orderRequest.getTicketCategoryId(), orderRequest.getNumberOfTickets());
//
//        Map<String, Orders> response = new HashMap<>();
//        response.put("order", order);
//
//        return ResponseEntity.ok(response);
//    }
}

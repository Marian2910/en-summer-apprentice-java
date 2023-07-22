package com.Endava.EventTix.Controller;
import com.Endava.EventTix.Model.DTOs.OrdersDTOInput;
import com.Endava.EventTix.Model.DTOs.OrdersDTO;
import com.Endava.EventTix.Service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public List<OrdersDTO> getEventsByVenueIdAndEventType() {
        int customerID = 2;
        return ordersService.getOrdersByCustomerId(customerID);
    }
    @PostMapping("/post")
    public OrdersDTO createOrder(@RequestBody OrdersDTOInput ordersDTOInput) {
        return ordersService.createOrder(ordersDTOInput);
    }
}

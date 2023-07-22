package com.Endava.EventTix.Controller;
import com.Endava.EventTix.Model.Orders;
import com.Endava.EventTix.Model.DTOs.OrdersDTO;
import com.Endava.EventTix.Service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
        int customerID = 4;
        List<Orders> orders = ordersService.getOrdersByCustomerId(customerID);

        List<OrdersDTO> ordersDTOList = new ArrayList<>();

        for (Orders order : orders) {
            OrdersDTO ordersDTO = new OrdersDTO();
            ordersDTO.setOrderID(order.getOrderID());
            ordersDTO.setTicketCategoryId(order.getTicketCategoryID().getTicketCategoryId());
            ordersDTO.setOrderedAt(order.getOrderedAt());
            ordersDTO.setNumberOfTickets(order.getNumberOfTickets());
            ordersDTO.setTotalPrice(order.getTotalPrice());

            ordersDTOList.add(ordersDTO);
        }

        return ordersDTOList;
    }

}

package com.Endava.EventTix.Service;
import com.Endava.EventTix.Model.DTOs.*;
import com.Endava.EventTix.Persistance.CustomerRepository;
import com.Endava.EventTix.Persistance.OrdersRepository;
import com.Endava.EventTix.Model.Orders;
import com.Endava.EventTix.Persistance.TicketCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.apache.el.lang.ELArithmetic.multiply;

@Service
public class OrdersService {
    private final OrdersRepository ordersRepository;
    private final TicketCategoryRepository ticketCategoryRepository;
    private final CustomerRepository customerRepository;
    @Autowired
    public OrdersService(OrdersRepository ordersRepository, TicketCategoryRepository ticketCategoryRepository, CustomerRepository customerRepository) {
        this.ordersRepository = ordersRepository;
        this.ticketCategoryRepository = ticketCategoryRepository;
        this.customerRepository = customerRepository;
    }

    public List<OrdersDTO> getOrdersByCustomerId(int customerId) {

        List<OrdersDTO> ordersDTOList = new ArrayList<>();
        List<Orders> orders = ordersRepository.findOrdersByCustomerID_CustomerID(customerId);

        for (Orders order : orders) {
            OrdersDTO ordersDTO = new OrdersDTO();
            ordersDTO.setEventID(ticketCategoryRepository.findTicketCategoryByTicketCategoryId(order.getTicketCategoryID().getTicketCategoryId()).getEventID().getEventID());
            ordersDTO.setTicketCategoryId(order.getTicketCategoryID().getTicketCategoryId());
            ordersDTO.setOrderedAt(order.getOrderedAt());
            ordersDTO.setNumberOfTickets(order.getNumberOfTickets());
            ordersDTO.setTotalPrice(order.getTotalPrice());

            ordersDTOList.add(ordersDTO);
        }
        return ordersDTOList;
    }

    public OrdersDTO createOrder(OrdersDTOInput orderDTOInput) {
        Orders order = new Orders();

        order.setTicketCategoryID(ticketCategoryRepository.findTicketCategoryByTicketCategoryId(orderDTOInput.getTicketCategoryId()));
        order.setNumberOfTickets(orderDTOInput.getNumberOfTickets());
        order.setCustomerID(customerRepository.getCustomerByCustomerID(3));
        order.setOrderedAt(LocalDateTime.now());
        order.setTotalPrice((BigDecimal) multiply(new BigDecimal(orderDTOInput.getNumberOfTickets()), ticketCategoryRepository.findTicketCategoryByTicketCategoryId(orderDTOInput.getTicketCategoryId()).getPrice()));
        Orders newOrder = ordersRepository.save(order);
        OrdersDTO ordersDTO = new OrdersDTO();
        ordersDTO.setEventID(ticketCategoryRepository.findTicketCategoryByTicketCategoryId(newOrder.getTicketCategoryID().getTicketCategoryId()).getEventID().getEventID());
        ordersDTO.setOrderedAt(newOrder.getOrderedAt());
        ordersDTO.setTotalPrice(newOrder.getTotalPrice());
        ordersDTO.setNumberOfTickets(newOrder.getNumberOfTickets());
        ordersDTO.setTicketCategoryId(newOrder.getTicketCategoryID().getTicketCategoryId());
        return ordersDTO;
    }
}

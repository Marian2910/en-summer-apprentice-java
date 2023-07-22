package com.Endava.EventTix.Model.DTOs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrdersDTO {
    private int orderID;
    private int ticketCategoryId;
    private LocalDateTime orderedAt;
    private int numberOfTickets;
    private BigDecimal totalPrice;
}


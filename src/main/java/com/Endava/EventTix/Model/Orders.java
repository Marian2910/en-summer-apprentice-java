package com.Endava.EventTix.Model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Orders {
    int orderID;
    int customerID;
    int ticketCategoryID;
    LocalDateTime orderedAt;
    int numberOfTickets;
    BigDecimal totalPrice;

    public Orders(int orderID, int customerID, int ticketCategoryID, LocalDateTime orderedAt, int numberOfTickets, BigDecimal totalPrice) {
        this.orderID = orderID;
        this.customerID = customerID;
        this.ticketCategoryID = ticketCategoryID;
        this.orderedAt = orderedAt;
        this.numberOfTickets = numberOfTickets;
        this.totalPrice = totalPrice;
    }

    public Orders(int customerID, int ticketCategoryID, int numberOfTickets, BigDecimal totalPrice) {
        this.customerID = customerID;
        this.ticketCategoryID = ticketCategoryID;
        this.numberOfTickets = numberOfTickets;
        this.totalPrice = totalPrice;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getTicketCategoryID() {
        return ticketCategoryID;
    }

    public void setTicketCategoryID(int ticketCategoryID) {
        this.ticketCategoryID = ticketCategoryID;
    }

    public LocalDateTime getOrderedAt() {
        return orderedAt;
    }

    public void setOrderedAt(LocalDateTime orderedAt) {
        this.orderedAt = orderedAt;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID=" + orderID +
                ", customerID=" + customerID +
                ", ticketCategoryID=" + ticketCategoryID +
                ", orderedAt=" + orderedAt +
                ", numberOfTickets=" + numberOfTickets +
                ", totalPrice=" + totalPrice +
                '}';
    }
}

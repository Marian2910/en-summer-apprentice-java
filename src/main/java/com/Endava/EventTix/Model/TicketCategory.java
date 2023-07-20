package com.Endava.EventTix.Model;

import java.math.BigDecimal;

public class TicketCategory {
    Integer ticketCategoryId;
    Integer eventID;
    String description;
    BigDecimal price;

    public TicketCategory(Integer ticketCategoryId, Integer eventID, String description, BigDecimal price) {
        this.ticketCategoryId = ticketCategoryId;
        this.eventID = eventID;
        this.description = description;
        this.price = price;
    }

    public Integer getTicketCategoryId() {
        return ticketCategoryId;
    }

    public void setTicketCategoryId(Integer ticketCategoryId) {
        this.ticketCategoryId = ticketCategoryId;
    }

    public Integer getEventID() {
        return eventID;
    }

    public void setEventID(Integer eventID) {
        this.eventID = eventID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "TicketCategory{" +
                "ticketCategoryId=" + ticketCategoryId +
                ", eventID=" + eventID +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}

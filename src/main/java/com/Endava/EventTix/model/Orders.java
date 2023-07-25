package com.Endava.EventTix.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Table(name = "Orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer orderID;
    @ManyToOne
    @JoinColumn(name = "customerID")
    @JsonIgnore
    Customer customerID;

    @ManyToOne
    @JoinColumn(name = "ticketCategoryID")
    TicketCategory ticketCategoryID;

    @Column(name = "orderedAt")
    LocalDateTime orderedAt;
    @Column(name = "numberOfTickets")
    int numberOfTickets;
    @Column(name = "totalPrice")
    BigDecimal totalPrice;

}

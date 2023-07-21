package com.Endava.EventTix.Model;

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
    int orderID;
    @ManyToOne
    @JoinColumn(name="customerID")
    Customer customerID;
    @OneToOne
    @JoinColumn(name="ticketCategoryID")
    TicketCategory ticketCategoryID;

    @Column(name = "orderedAt")
    LocalDateTime orderedAt;
    @Column(name = "numberOfTickets")
    int numberOfTickets;
    @Column(name = "totalPrice")
    BigDecimal totalPrice;

}

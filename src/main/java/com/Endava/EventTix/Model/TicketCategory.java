package com.Endava.EventTix.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TicketCategory")
public class TicketCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer ticketCategoryId;
    @ManyToOne
    @JoinColumn(name = "eventID")
    Event eventID;
    @Column(name = "description")
    String description;
    @Column(name = "price")
    BigDecimal price;


}

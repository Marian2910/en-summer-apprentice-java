package com.Endava.EventTix.Model;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Venue")
public class Venue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer venueID;
    @Column(name = "location")
    String location;
    @Column(name = "type")
    String type;
    @Column(name = "capacity")
    Integer capacity;
}
package com.Endava.EventTix.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Event")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int eventID;

    @OneToMany
    @JoinColumn(name="venueID")
    List<Venue> venueID;

    @OneToOne
    @JoinColumn(name = "eventTypeID")
    EventType eventTypeID;

    @Column(name = "eventDescription")
    String eventDescription;
    @Column(name = "eventName")
    String eventName;
    @Column(name = "startDate")
    LocalDateTime startDate;
    @Column(name = "endDate")
    LocalDateTime endDate;
}


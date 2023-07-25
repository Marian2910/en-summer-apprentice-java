package com.Endava.EventTix.dto;

import com.Endava.EventTix.model.Venue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EventDTO {
    private int eventID;
    private Venue venueID;
    private String eventType;

    private String eventDescription;
    private String eventName;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private List<TicketCategoryDTO> ticketCategories;

}

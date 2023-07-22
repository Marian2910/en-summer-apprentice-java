package com.Endava.EventTix.Controller;

import com.Endava.EventTix.Model.*;
import com.Endava.EventTix.Model.DTOs.EventDTO;
import com.Endava.EventTix.Model.DTOs.TicketCategoryDTO;
import com.Endava.EventTix.Service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "event")
public class EventController {
    private final EventService eventService;

    @Autowired
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping
    public List<EventDTO> getEventsByVenueIdAndEventType(@RequestParam Integer venueID, @RequestParam String eventType) {
        List<Event> events = eventService.getEventByVenueAndEventType(venueID, eventType);

        List<EventDTO> eventDTOList = new ArrayList<>();

        for (Event event : events) {
            EventDTO eventDTO = new EventDTO();
            eventDTO.setEventID(event.getEventID());
            eventDTO.setVenueID(event.getVenueID());
            eventDTO.setEventName(event.getEventName());
            eventDTO.setEventDescription(event.getEventDescription());
            eventDTO.setStartDate(event.getStartDate());
            eventDTO.setEndDate(event.getEndDate());
            eventDTO.setVenueID(event.getVenueID());
            eventDTO.setEventTypeID(event.getEventTypeID());

            List<TicketCategoryDTO> ticketCategoryDTOList = event.getTicketCategories().stream()
                    .map(ticketCategory -> {
                        TicketCategoryDTO ticketCategoryDTO = new TicketCategoryDTO();
                        ticketCategoryDTO.setTicketCategoryId(ticketCategory.getTicketCategoryId());
                        ticketCategoryDTO.setDescription(ticketCategory.getDescription());
                        ticketCategoryDTO.setPrice(ticketCategory.getPrice());
                        return ticketCategoryDTO;
                    })
                    .collect(Collectors.toList());

            eventDTO.setTicketCategories(ticketCategoryDTOList);

            eventDTOList.add(eventDTO);
        }

        return eventDTOList;
}}

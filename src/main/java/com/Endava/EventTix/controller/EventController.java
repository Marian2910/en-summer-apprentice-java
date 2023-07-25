package com.Endava.EventTix.controller;

import com.Endava.EventTix.dto.EventDTO;
import com.Endava.EventTix.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

        return eventService.getEventByVenueAndEventType(venueID, eventType);
}}

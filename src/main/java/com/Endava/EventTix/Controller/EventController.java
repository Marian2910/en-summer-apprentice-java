package com.Endava.EventTix.Controller;

import com.Endava.EventTix.Model.Event;
import com.Endava.EventTix.Model.EventType;
import com.Endava.EventTix.Model.Venue;
import com.Endava.EventTix.Service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/event")
public class EventController {
    private final EventService eventService;

    @Autowired
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

//    @GetMapping
//    public List<Event> getEvents(@RequestParam(name = "venueID") Venue venueID,
//                                 @RequestParam(name = "eventType") EventType eventType) {
//        return eventService.getEventsByVenueIdAndType(venueID, eventType);
//    }
    @GetMapping
    public List<Event> getEvents() {
        return eventService.getEvents();
    }
}

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
@RequestMapping(path = "event")
public class EventController {
    @Autowired
    private EventService eventService;

//    @Autowired
//    public EventController(EventService eventService) {
//        this.eventService = eventService;
//    }

    @GetMapping
    public List<Event> getEventsByVenueIdAndEventType(@RequestParam Integer venueID, @RequestParam String eventType) {
        return eventService.getEventyByVenue(venueID, eventType);
    }

//    @GetMapping
//    public List<Event> getEvents() {
//        return eventService.getEvents();
//    }
}

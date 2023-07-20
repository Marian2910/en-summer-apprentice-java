//package com.Endava.EventTix.Controller;
//
//import com.Endava.EventTix.Model.Event;
//import com.Endava.EventTix.Model.EventType;
//import com.Endava.EventTix.Service.EventService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import java.util.List;
//
//public class EventController {
//    private final EventService eventService;
//
//    @Autowired
//    public EventController(EventService eventService) {
//        this.eventService = eventService;
//    }
//
//    @GetMapping
//    public List<Event> getEvents(@RequestParam(name = "venueId") int venueId,
//                                 @RequestParam(name = "eventType") EventType eventType) {
//        return eventService.getEventsByVenueIdAndType(venueId, eventType);
//    }
//}

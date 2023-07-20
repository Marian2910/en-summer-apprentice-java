//package com.Endava.EventTix.Service;
//
//import com.Endava.EventTix.Model.Event;
//import com.Endava.EventTix.Model.EventType;
//import com.Endava.EventTix.Persistance.EventRepository;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class EventService {
//    private final EventRepository eventRepository;
//
//    public EventService(EventRepository eventRepository) {
//        this.eventRepository = eventRepository;
//    }
//
//    public List<Event> getEventsByVenueIdAndType(int venueId, EventType eventType) {
//        return eventRepository.findByVenueIdAndType(venueId, eventType);
//    }
//}

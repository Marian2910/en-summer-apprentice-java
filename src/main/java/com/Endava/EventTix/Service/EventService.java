package com.Endava.EventTix.Service;

import com.Endava.EventTix.Model.Event;
import com.Endava.EventTix.Model.EventType;
import com.Endava.EventTix.Model.Venue;
import com.Endava.EventTix.Persistance.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {
    @Autowired
    private EventRepository eventRepository;

//    @Autowired
//    public EventService(EventRepository eventRepository) {
//        this.eventRepository = eventRepository;
//    }
//
    public List<Event> getEventyByVenue(Integer venueId, String eventType){
        return eventRepository.findEventByVenueID_VenueIDAndEventTypeID_EventTypeName(venueId, eventType);
    }
    public List<Event> getEvents() {
        return (List<Event>) eventRepository.findAll();
    }

}

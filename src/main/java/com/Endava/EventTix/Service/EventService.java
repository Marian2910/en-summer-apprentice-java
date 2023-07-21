package com.Endava.EventTix.Service;

import com.Endava.EventTix.Model.Customer;
import com.Endava.EventTix.Model.Event;
import com.Endava.EventTix.Model.EventType;
import com.Endava.EventTix.Model.Venue;
import com.Endava.EventTix.Persistance.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {
    private final EventRepository eventRepository;

    @Autowired
    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }


//    public List<Event> getEventsByVenueIdAndType(Venue venueID, EventType eventType) {
//        return eventRepository.findByVenueIDAndType(venueID, eventType);
//    }
    public List<Event> getEvents() {
        return (List<Event>) eventRepository.findAll();
    }

}

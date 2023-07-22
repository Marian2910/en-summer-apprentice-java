package com.Endava.EventTix.Service;

import com.Endava.EventTix.Model.Event;
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

    public List<Event> getEventByVenueAndEventType(Integer venueID, String eventType){
        return eventRepository.findEventsByVenueID_VenueIDAndEventTypeID_EventTypeName(venueID, eventType);
    }
}

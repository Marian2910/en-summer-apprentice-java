package com.Endava.EventTix.persistance;


import com.Endava.EventTix.model.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository  extends CrudRepository<Event, Integer> {
    List<Event> findEventsByVenueID_VenueIDAndEventTypeID_EventTypeName(Integer venueID, String eventType);

}

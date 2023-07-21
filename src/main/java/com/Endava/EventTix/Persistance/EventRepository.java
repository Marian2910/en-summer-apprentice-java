package com.Endava.EventTix.Persistance;


import com.Endava.EventTix.Model.Event;
import com.Endava.EventTix.Model.EventType;
import com.Endava.EventTix.Model.Venue;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository  extends CrudRepository<Event, Integer> {
//    List<Event> findByVenueIDAndType(Venue venueID, EventType type);
}

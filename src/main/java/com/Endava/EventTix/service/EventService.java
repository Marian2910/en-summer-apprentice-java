package com.Endava.EventTix.service;

import com.Endava.EventTix.dto.EventDTO;
import com.Endava.EventTix.dto.TicketCategoryDTO;
import com.Endava.EventTix.model.Event;
import com.Endava.EventTix.persistance.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EventService {
    private final EventRepository eventRepository;
    @Autowired
    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<EventDTO> getEventByVenueAndEventType(Integer venueID, String eventType){
        List<Event> events = eventRepository.findEventsByVenueID_VenueIDAndEventTypeID_EventTypeName(venueID, eventType);

        List<EventDTO> eventDTOList = new ArrayList<>();

        for (Event event : events) {
            EventDTO eventDTO = new EventDTO();
            eventDTO.setEventID(event.getEventID());
            eventDTO.setVenueID(event.getVenueID());
            eventDTO.setEventName(event.getEventName());
            eventDTO.setEventDescription(event.getEventDescription());
            eventDTO.setStartDate(event.getStartDate());
            eventDTO.setEndDate(event.getEndDate());
            eventDTO.setVenueID(event.getVenueID());
            eventDTO.setEventType(event.getEventTypeID().getEventTypeName());

            List<TicketCategoryDTO> ticketCategoryDTOList = event.getTicketCategories().stream()
                    .map(ticketCategory -> {
                        TicketCategoryDTO ticketCategoryDTO = new TicketCategoryDTO();
                        ticketCategoryDTO.setTicketCategoryId(ticketCategory.getTicketCategoryId());
                        ticketCategoryDTO.setDescription(ticketCategory.getDescription());
                        ticketCategoryDTO.setPrice(ticketCategory.getPrice());
                        return ticketCategoryDTO;
                    })
                    .collect(Collectors.toList());

            eventDTO.setTicketCategories(ticketCategoryDTOList);

            eventDTOList.add(eventDTO);
        }

        return eventDTOList;
    }
}

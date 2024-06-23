package com.pace.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pace.springboot.model.Event;
import com.pace.springboot.repository.EventRepository;

@Service
public class EventService {
	@Autowired
	EventRepository eventsRepository;
	
	public List<Event> getAllEvents(){
		List<Event> eventList;
		eventList = (List<Event>) eventsRepository.findAll();
		for (Event event : eventList) {
			System.out.println(event.getCustomerid());
		}
		return eventList;
	} 
	
	public Event getEventById(int id) {
		return eventsRepository.findById(id).get();
	}
	
	public void saveEvent(Event event) {
		eventsRepository.save(event);
	}
	
	public void updateEvent(Event event) {
		eventsRepository.save(event);
	}
	
	public void deleteEvent(int id) {
		eventsRepository.deleteById(id);
	}
}

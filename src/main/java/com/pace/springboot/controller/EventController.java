package com.pace.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pace.springboot.model.Event;
import com.pace.springboot.service.EventService;

@RestController
@RequestMapping("api/v1/event")
public class EventController {
	@Autowired
	EventService eventService;
	
	@GetMapping("/getallevents")
	private List<Event> getAllEvents() {
		return eventService.getAllEvents();
	}
	
	@PostMapping("/addevent")
	private int saveEvent(@RequestBody Event event) {
		eventService.saveEvent(event);
		return event.getCustomerid();
	}
	
	@GetMapping("/getevent/{customerid}")
	private Event getEvents(@PathVariable("customerid")int customerid) {
		return eventService.getEventById(customerid);
	}
	
	@PutMapping("/updateevent")
	private Event update(@RequestBody Event event) {
		eventService.updateEvent(event);
		return event;
	}
	
	@DeleteMapping("/deleteevent/{customerid}")
	private void deleteEvent(@PathVariable("customerid")int customerid) {
		eventService.deleteEvent(customerid);
	}
}

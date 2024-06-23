package com.pace.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.pace.springboot.model.Event;

public interface EventRepository extends CrudRepository<Event, Integer>{
	
}

package com.eventhandling.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.eventhandling.publisher.EventPublisher;

@Controller
public class EventHandlig {
	
	@Autowired
	EventPublisher publisher;
	
	@GetMapping("/custom/event") 
	@ResponseBody
	public String customEvent() {
		publisher.publish();
		return "custom event";
	}

}

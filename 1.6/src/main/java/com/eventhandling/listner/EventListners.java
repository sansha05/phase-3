package com.eventhandling.listner;

import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EventListners {
	
	@EventListener
	public void onContextStarted(ContextStartedEvent contextStartedEvent) {
		System.out.println("context started!!!!!!!!");
	}

}

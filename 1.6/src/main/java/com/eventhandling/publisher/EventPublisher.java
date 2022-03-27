package com.eventhandling.publisher;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

import com.eventhandling.event.CustomEvent;

@Component
public class EventPublisher implements ApplicationEventPublisherAware {
	
	ApplicationEventPublisher publisher;

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		
		this.publisher = applicationEventPublisher;
	}
	
	public void publish() {
		CustomEvent customEvent = new CustomEvent(this);
		publisher.publishEvent(customEvent);
	}
	
	

}

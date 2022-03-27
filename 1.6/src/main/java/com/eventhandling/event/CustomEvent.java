package com.eventhandling.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

@Component
public class CustomEvent extends ApplicationEvent {
	private static final long serialVersionUID = 1L;

	public CustomEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}
	

}

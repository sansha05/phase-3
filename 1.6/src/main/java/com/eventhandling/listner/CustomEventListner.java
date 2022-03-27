package com.eventhandling.listner;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.eventhandling.event.CustomEvent;

@Component
public class CustomEventListner {
	
	
	
	@EventListener
	public void onCustomEvent(CustomEvent customEvent) {
		System.out.println("custom event published!!!!!!!!");
		
	}

}

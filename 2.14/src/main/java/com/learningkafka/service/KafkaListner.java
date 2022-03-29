package com.learningkafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaListner {
	
	@KafkaListener(topics="message_topic", groupId="group1")
	public void consume(String message) {
		System.out.println("consumed message" + message);
		
	}
	
	@KafkaListener(topics="message_topic", groupId="group2")
	public void consume2(String mess) {
		System.out.println("consumed message2 " +mess);
	}

}

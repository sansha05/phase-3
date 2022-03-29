package com.learningkafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaSender {
	
	private static final String MESSAGE_TOPIC="message_topic";
	
	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	
	public void send(String message) {
		kafkaTemplate.send(MESSAGE_TOPIC, message);
		
	}

}

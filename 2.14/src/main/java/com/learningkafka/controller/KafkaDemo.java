package com.learningkafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learningkafka.service.KafkaSender;

@RestController
public class KafkaDemo {
	
	@Autowired
	KafkaSender kafkaSender;
	
	@GetMapping("/publish")
	public String publish(@RequestParam(name="message") String message) {
		kafkaSender.send(message);
		return "message is sent to the kafka topic";
	}
	
}

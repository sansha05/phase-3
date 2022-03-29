package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Feedback;
import com.service.FeedbackServ;

@RestController
public class FeedbackController {
	
	@Autowired
	FeedbackServ feedbackServ;
	
	@PostMapping("/add-feedback")
	public String addFeedback(@RequestBody Feedback feedback) {
		feedbackServ.saveFeedBack(feedback);
		
		
		return "new feedback add";
	}
}

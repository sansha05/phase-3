package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Feedback;
import com.repository.FeedbackRepo;

@Service
public class FeedbackServ {
	
	@Autowired
	FeedbackRepo feedbackRepo;
	
	public void saveFeedBack(Feedback f) {
		
		feedbackRepo.save(f);
	}
}

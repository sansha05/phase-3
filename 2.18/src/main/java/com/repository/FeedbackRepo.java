package com.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entity.Feedback;

@Repository
public interface FeedbackRepo extends CrudRepository<Feedback, Integer>{

}

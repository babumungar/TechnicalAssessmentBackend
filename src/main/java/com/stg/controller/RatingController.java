package com.stg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.stg.model.Rating;
import com.stg.service.RatingService;

public class RatingController {
	@Autowired
	private RatingService ratingService;

	@PostMapping(value = "/create/{skillRating}/{candidateId}/{skillId}")
	public ResponseEntity<Rating> addInterviewDetials(@RequestBody Rating rating, @PathVariable("skillRating") int skillRating, @PathVariable("candidateId") int candidateId, @PathVariable("skillId") int skillId ) {
		return new ResponseEntity<Rating>(ratingService.addSkillRating(skillRating, candidateId, skillId), HttpStatus.CREATED);
	}
}

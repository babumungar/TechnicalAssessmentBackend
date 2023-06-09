package com.stg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.stg.dto.Interviewdto;
import com.stg.model.Interview;
import com.stg.service.InterviewService;

public class InterviewController {
	@Autowired
	private InterviewService interviewService;

	@PostMapping(value = "/create")
	public ResponseEntity<Interview> addingInterviewDetails(@RequestBody Interviewdto interviewdto) {
		return new ResponseEntity<Interview>(interviewService.addInterviewDetials(interviewdto), HttpStatus.CREATED);
	}
}

package com.stg.repository;

import java.util.Optional;

import com.stg.model.Candidate;
import com.stg.model.Interview;

public interface InterviewRepository {
	public Interview save(Optional<Interview> interviewOb);

	public Optional<Interview> findById(int interviewId);
}

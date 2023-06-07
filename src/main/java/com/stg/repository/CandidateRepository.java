package com.stg.repository;

import org.springframework.data.repository.CrudRepository;

import com.stg.model.Candidate;

public interface CandidateRepository extends CrudRepository<Candidate, Integer>  {
	

}

package com.stg.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.stg.model.Candidate;

public interface CandidateRepository extends CrudRepository<Candidate, Integer> {

	public Candidate save(Optional<Candidate> candidateOb);

	public Optional<Candidate> findByName(String name);

	public Optional<Candidate> findByEmail(String email);

}

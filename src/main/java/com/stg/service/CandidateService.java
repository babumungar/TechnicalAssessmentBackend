package com.stg.service;

import java.util.List;
import java.util.Optional;

import com.stg.exceptions.ResourceNotFoundException;
import com.stg.model.Candidate;

public interface CandidateService {
	public abstract Candidate addCandidate(Candidate candidate) throws Exception;

	public abstract List<Candidate> findAllCandidates() throws ResourceNotFoundException;

	public abstract Optional<Candidate> searchCandidateById(int candidate_Id) throws ResourceNotFoundException;

	public abstract Candidate searchByName(String name) throws ResourceNotFoundException;

	public abstract String deleteById(int candidate_Id) throws ResourceNotFoundException;

	public abstract Optional<Candidate> updateById(int candidate_Id, Candidate candidate) throws ResourceNotFoundException;

	public abstract Optional<Candidate> getCandidate(String email);

}

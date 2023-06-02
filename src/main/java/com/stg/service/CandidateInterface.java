package com.stg.service;

import java.util.List;

import com.stg.exceptions.ResourceNotFoundException;
import com.stg.model.Candidate;

public interface CandidateInterface {
	public abstract Candidate create(Candidate candidate);

	public abstract List<Candidate> findAllCandidates() throws ResourceNotFoundException;

	public abstract Candidate readById(int id) throws ResourceNotFoundException;

	public abstract Candidate readByName(String name) throws ResourceNotFoundException;

	public abstract String deleteById(int id) throws ResourceNotFoundException;

	public abstract Candidate updateById(int id, Candidate candidate) throws ResourceNotFoundException;
	public abstract Candidate getCandidate(String email);

}

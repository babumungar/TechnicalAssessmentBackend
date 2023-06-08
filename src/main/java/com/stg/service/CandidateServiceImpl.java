package com.stg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stg.exceptions.ResourceNotFoundException;
import com.stg.model.Candidate;
import com.stg.repository.CandidateRepository;

@Service
public class CandidateServiceImpl implements CandidateService {

	@Autowired
	private CandidateRepository candidateRepository;

	@Override
	public Candidate addCandidate(Candidate candidate) throws Exception {

		Optional<Candidate> candidateOb = candidateRepository.findById(candidate.getCandidate_Id());

		if (candidateOb.isPresent()) {
			throw new Exception("Data already exists with the decision maker ID");
		}
		return candidateRepository.save(candidateOb);
	}

	@Override
	public List<Candidate> findAllCandidates() throws ResourceNotFoundException {

		return (List<Candidate>) candidateRepository.findAll();

	}

	@Override
	public Optional<Candidate> searchCandidateById(int candidate_Id) throws ResourceNotFoundException {

		if (candidateRepository.existsById(candidate_Id)) {

			return candidateRepository.findById(candidate_Id);
		} else {
			throw new ResourceNotFoundException("No data with this decision maker ID");
		}

	}

	@Override
	public Candidate searchByName(String name) throws ResourceNotFoundException {
		Optional<Candidate> candidateObj = candidateRepository.findByName(name);

		if (candidateObj.isPresent()) {
			return candidateObj.get();
		} else {
			throw new ResourceNotFoundException("No data ");
		}

	}

	@Override
	public String deleteById(int candidate_Id) throws ResourceNotFoundException {

		candidateRepository.deleteById(candidate_Id);
		return "candidate deleted !";

	}

	@Override
	public Optional<Candidate> updateById(int candidate_Id, Candidate newCandidate) throws ResourceNotFoundException {

	    Optional<Candidate> optional = candidateRepository.findById(candidate_Id);

	    if (optional.isPresent()) {
	        Candidate candidate = optional.get();
	        candidateRepository.delete(candidate);
	        newCandidate.setCandidate_Id(candidate_Id);
	        return Optional.of(candidateRepository.save(newCandidate));
	    } else {
	        throw new ResourceNotFoundException("No data ");
	    }
	}

	@Override
	public Optional<Candidate> getCandidate(String email) {
		Optional<Candidate> candidateObj = candidateRepository.findByEmail(email);

		if (candidateObj.isPresent()) {
			return candidateObj;
		} else {
			throw new ResourceNotFoundException("No data ");
		}
	}


}

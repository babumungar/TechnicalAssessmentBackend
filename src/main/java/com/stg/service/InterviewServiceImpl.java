package com.stg.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.stg.dto.Interviewdto;
import com.stg.model.Interview;
import com.stg.repository.InterviewRepository;
import com.stg.model.Interview;

@Service
public class InterviewServiceImpl implements InterviewService {

	private InterviewRepository interviewRepository;

	@Override
	public Interview addInterviewDetials(Interviewdto interviewdto) throws Exception {
		Optional<Interview> interviewOb = interviewRepository.findById(interviewdto.getInterviewId());

		if (interviewOb.isPresent()) {
			throw new Exception("Data already exists ");
		}
		return interviewRepository.save(interviewOb);

	}

}

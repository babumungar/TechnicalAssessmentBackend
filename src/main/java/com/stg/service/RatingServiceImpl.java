package com.stg.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.stg.model.Rating;
import com.stg.model.Rating;
import com.stg.repository.RatingRepository;

@Service
public class RatingServiceImpl implements RatingService {

	private RatingRepository ratingRepository;
	
	@Override
	public Rating  addSkillRating(int rating_Id, int skillRating, int candidateId, int skillId) throws Exception {
		Optional<Rating> ratingOb = ratingRepository.findById(rating_Id);

		if (ratingOb.isPresent()) {
			throw new Exception("Data already exists");
		}
		return ratingRepository.save(ratingOb);
		
	}

}

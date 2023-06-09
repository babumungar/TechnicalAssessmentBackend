package com.stg.service;

import java.util.Optional;

import com.stg.model.Rating;
import com.stg.model.Skill;

public interface RatingService {
	
	public abstract Rating  addSkillRating(int rating_Id, int skillRating, int candidateId, int skillId) throws Exception;


}

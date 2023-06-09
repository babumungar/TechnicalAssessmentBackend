package com.stg.service;

import com.stg.model.Rating;
import com.stg.model.Skill;

public interface RatingService {
	
	public abstract Rating addSkillRating(int skillRating , int candidateId, int skillId );

}

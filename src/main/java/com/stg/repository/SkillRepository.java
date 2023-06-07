package com.stg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stg.model.Skill;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Integer> {
	
	
    Skill createSkill(String skillName);

}


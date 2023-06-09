package com.stg.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the rating database table.
 * 
 */
@Entity
@Table
public class Rating {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rating_Id;

//	@Column(name = "skill_feedback")
//	private String skillFeedback;

	@Column(name = "skill_rating")
	private int skillRating;

	// bi-directional many-to-one association to Skill
	@ManyToOne
	@JoinColumn(name = "skill_Id")
	private Skill skill;

	// bi-directional many-to-one association to Candidate
	@ManyToOne
	@JoinColumn(name = "candidate_Id")
	private Candidate candidate;

	public Rating() {
	}

	public int getRating_Id() {
		return this.rating_Id;
	}

	public void setRating_Id(int rating_Id) {
		this.rating_Id = rating_Id;
	}

	
	public int getSkillRating() {
		return this.skillRating;
	}

	public void setSkillRating(int skillRating) {
		this.skillRating = skillRating;
	}

	public Skill getSkill() {
		return this.skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	public Candidate getCandidate() {
		return this.candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

}
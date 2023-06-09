package com.stg.model;

import java.io.Serializable;
import javax.persistence.*;

import java.util.List;

/**
 * The persistent class for the skill database table.
 * 
 */
@Entity
@Table
public class Skill  {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int skill_Id;

	@Column(name = "skill_level")
	private int skillLevel;

	@Column(name = "skill_name")
	private String skillName;

	// bi-directional many-to-one association to Rating
	@OneToMany(mappedBy = "skill")
	private List<Rating> ratings;

	public Skill() {
	}

	public int getSkill_Id() {
		return this.skill_Id;
	}

	public void setSkill_Id(int skill_Id) {
		this.skill_Id = skill_Id;
	}

	public int getSkillLevel() {
		return this.skillLevel;
	}

	public void setSkillLevel(int skillLevel) {
		this.skillLevel = skillLevel;
	}

	public String getSkillName() {
		return this.skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public List<Rating> getRatings() {
		return this.ratings;
	}

	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}

	public Rating addRating(Rating rating) {
		getRatings().add(rating);
		rating.setSkill(this);

		return rating;
	}

	public Rating removeRating(Rating rating) {
		getRatings().remove(rating);
		rating.setSkill(null);

		return rating;
	}

}
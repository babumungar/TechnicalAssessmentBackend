package com.stg.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the candidate database table.
 * 
 */
@Entity
@Table
public class Candidate {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int candidate_Id;

	@Column(name = "address_line_1")
	private String addressLine1;

	@Column(name = "address_line_2")
	private String addressLine2;

	private String city;

	private String email;

	private String first_Name;

	private String last_Name;

	private String phone;

	private int pincode;

	private String position;

	private String positionApplied;

	private String qualification;

	@Column(name = "rel_experience")
	private int relExperience;

	private String state;

	@Column(name = "total_experience")
	private int totalExperience;

	// bi-directional many-to-one association to Employee
	@ManyToOne
	@JoinColumn(name = "refferedBy", referencedColumnName = "employee_Id")
	private Employee employee;

	// bi-directional many-to-one association to Rating
	@OneToMany(mappedBy = "candidate")
	private List<Rating> ratings;

	// bi-directional many-to-one association to Interview
	@OneToMany(mappedBy = "candidate")
	private List<Interview> interviews;

	public Candidate() {
	}

	public int getCandidate_Id() {
		return this.candidate_Id;
	}

	public void setCandidate_Id(int candidate_Id) {
		this.candidate_Id = candidate_Id;
	}

	public String getAddressLine1() {
		return this.addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return this.addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirst_Name() {
		return this.first_Name;
	}

	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}

	public String getLast_Name() {
		return this.last_Name;
	}

	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getPincode() {
		return this.pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getPositionApplied() {
		return this.positionApplied;
	}

	public void setPositionApplied(String positionApplied) {
		this.positionApplied = positionApplied;
	}

	public String getQualification() {
		return this.qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public int getRelExperience() {
		return this.relExperience;
	}

	public void setRelExperience(int relExperience) {
		this.relExperience = relExperience;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getTotalExperience() {
		return this.totalExperience;
	}

	public void setTotalExperience(int totalExperience) {
		this.totalExperience = totalExperience;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public List<Rating> getRatings() {
		return this.ratings;
	}

	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}

	public Rating addRating(Rating rating) {
		getRatings().add(rating);
		rating.setCandidate(this);

		return rating;
	}

	public Rating removeRating(Rating rating) {
		getRatings().remove(rating);
		rating.setCandidate(null);

		return rating;
	}

	public List<Interview> getInterviews() {
		return this.interviews;
	}

	public void setInterviews(List<Interview> interviews) {
		this.interviews = interviews;
	}

	public Interview addInterview(Interview interview) {
		getInterviews().add(interview);
		interview.setCandidate(this);

		return interview;
	}

	public Interview removeInterview(Interview interview) {
		getInterviews().remove(interview);
		interview.setCandidate(null);

		return interview;
	}

}
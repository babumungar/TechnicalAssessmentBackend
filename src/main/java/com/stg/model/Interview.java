package com.stg.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the interview database table.
 * 
 */
@Entity
@Table
public class Interview  {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int interview_Id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_time")
	private Date dateTime;

	private int duration;

	private String mode;

	@Column(name="overall_rating")
	private int overallRating;

	private int round;

	private String status;

	//bi-directional many-to-one association to Candidate
	@ManyToOne
	@JoinColumn(name="candidate_Id")
	private Candidate candidate;

	//bi-directional many-to-one association to Employee
	@ManyToOne
	@JoinColumn(name="interviewer_id", referencedColumnName="employee_Id")
	private Employee employee;

	public Interview() {
	}

	public int getInterview_Id() {
		return this.interview_Id;
	}

	public void setInterview_Id(int interview_Id) {
		this.interview_Id = interview_Id;
	}

	public Date getDateTime() {
		return this.dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public int getDuration() {
		return this.duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public int getOverallRating() {
		return this.overallRating;
	}

	public void setOverallRating(int overallRating) {
		this.overallRating = overallRating;
	}

	public int getRound() {
		return this.round;
	}

	public void setRound(int round) {
		this.round = round;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Candidate getCandidate() {
		return this.candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
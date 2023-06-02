package com.stg.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the employee database table.
 * 
 */
@Entity
@Table
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int employee_Id;

	@Column(name="dept_id")
	private int deptId;

	@Column(name="emp_first_name")
	private String empFirstName;

	@Column(name="emp_last_name")
	private String empLastName;

	@Column(name="emp_name")
	private String empName;

	private String employeename;

	@Column(name="login_id")
	private String loginId;

	@Column(name="pass_word")
	private String passWord;

	private float salary;

	//bi-directional many-to-one association to Candidate
	@OneToMany(mappedBy="employee")
	private List<Candidate> candidates;

	//bi-directional many-to-one association to Interview
	@OneToMany(mappedBy="employee")
	private List<Interview> interviews;

	public Employee() {
	}

	public int getEmployee_Id() {
		return this.employee_Id;
	}

	public void setEmployee_Id(int employee_Id) {
		this.employee_Id = employee_Id;
	}

	public int getDeptId() {
		return this.deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getEmpFirstName() {
		return this.empFirstName;
	}

	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}

	public String getEmpLastName() {
		return this.empLastName;
	}

	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}

	public String getEmpName() {
		return this.empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmployeename() {
		return this.employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public String getLoginId() {
		return this.loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassWord() {
		return this.passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public float getSalary() {
		return this.salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public List<Candidate> getCandidates() {
		return this.candidates;
	}

	public void setCandidates(List<Candidate> candidates) {
		this.candidates = candidates;
	}

	public Candidate addCandidate(Candidate candidate) {
		getCandidates().add(candidate);
		candidate.setEmployee(this);

		return candidate;
	}

	public Candidate removeCandidate(Candidate candidate) {
		getCandidates().remove(candidate);
		candidate.setEmployee(null);

		return candidate;
	}

	public List<Interview> getInterviews() {
		return this.interviews;
	}

	public void setInterviews(List<Interview> interviews) {
		this.interviews = interviews;
	}

	public Interview addInterview(Interview interview) {
		getInterviews().add(interview);
		interview.setEmployee(this);

		return interview;
	}

	public Interview removeInterview(Interview interview) {
		getInterviews().remove(interview);
		interview.setEmployee(null);

		return interview;
	}

}
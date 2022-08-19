package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tutor")
public class Tutor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int tutorId;
	private String username;
	private String password;
	private String name;
	private int mobile;
	private String email;
	private String schoolName;
	private String qualification;
	private String subject;
	private String city;
	
	public Tutor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tutor(int tutorId, String username, String password, String name, int mobile, String email,
			String schoolName, String qualification, String subject, String city) {
		super();
		this.tutorId = tutorId;
		this.username = username;
		this.password = password;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.schoolName = schoolName;
		this.qualification = qualification;
		this.subject = subject;
		this.city = city;
	}

	public int getTutorId() {
		return tutorId;
	}

	public void setTutorId(int tutorId) {
		this.tutorId = tutorId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Tutor [tutorId=" + tutorId + ", username=" + username + ", password=" + password + ", name=" + name
				+ ", mobile=" + mobile + ", email=" + email + ", schoolName=" + schoolName + ", qualification="
				+ qualification + ", subject=" + subject + ", city=" + city + "]";
	}
	
	

}

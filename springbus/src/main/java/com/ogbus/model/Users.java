package com.ogbus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import reactor.util.annotation.NonNull;

//import org.springframework.lang.NonNull;

@Entity
@Table
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
//	@NonNull
	@Column(name = "first_name", nullable=false, length = 12)
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "gender")
	private String gender;
//	@Column(name = "email_id",nullable=true)
//	private String emailId;
	@Column(name = "password")
	private String password;
	@Column(name = "mobile_number")
	private long mobileNumber;
	@Column(name = "age")
	private long age;

	@Column(name = "uid")
	private long uid;

	public Users() {

	}

	public Users(long id, String firstName, String lastName, String gender, String password,
			long mobileNumber, long age, long uid) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
//		this.emailId = emailId;
		this.password = password;
		this.mobileNumber = mobileNumber;
		this.age = age;
		this.uid=uid;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	

	public long getUid() {
		return uid;
	}

	public void setUid(long uid) {
		this.uid = uid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

//	public String getEmailId() {
//		return emailId;
//	}
//
//	public void setEmailId(String emailId) {
//		this.emailId = emailId;
//	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public long getAge() {
		return age;
	}

	public void setAge(long age) {
		this.age = age;
	}

}

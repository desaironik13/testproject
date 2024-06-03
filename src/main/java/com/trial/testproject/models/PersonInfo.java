package com.trial.testproject.models;


import com.github.javafaker.Faker;
import com.trial.testproject.annotations.IntegerDataCreator;
import com.trial.testproject.annotations.processors.IntegerDataCreatorProcessor;

import java.util.List;
import java.util.UUID;


public class PersonInfo {
	private UUID personId;
	private String firstName = new Faker().name().firstName();
	private String lastName =  new Faker().name().lastName();
	@IntegerDataCreator(max = 999999999, min = 100000000, constant="SSNS")
	private Integer ssn;

	@IntegerDataCreator(max = Integer.MAX_VALUE, min = 1111111111)
	private Integer phoneNumber;

	@IntegerDataCreator(max = Integer.MAX_VALUE, min = 1111111111)
	private Integer mobileNumber;
	private String emailId = new Faker().internet().emailAddress();

	
	
	public PersonInfo() throws Exception {
		super();
		IntegerDataCreatorProcessor.generateInteger(this);
		// TODO Auto-generated constructor stub
	}
	public UUID getPersonId() {
		return personId;
	}
	public void setPersonId(UUID personId) {
		this.personId = personId;
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
	public Integer getSsn() {
		return ssn;
	}

	public Integer getPhoneNumber() {
		return phoneNumber;
	}

	public Integer getMobileNumber() {
		return mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
}

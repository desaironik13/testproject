package gov.irs.testproject.models;

import net.datafaker.Faker;

import java.util.List;
import java.util.UUID;


public class PersonInfo {
	private UUID personId;
	private String firstName = new Faker().name().firstName();
	private String lastName =  new Faker().name().lastName();
	private String ssn = new Faker().expression("#{examplify '1231231230'}");
	private String phoneNumber = new Faker().expression("#{examplify '1231231230'}");
	private String mobileNumber = new Faker().expression("#{examplify '1231231230'}");
	private String emailId = new Faker().internet().emailAddress();

	
	
	public PersonInfo() {
		super();
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
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
}

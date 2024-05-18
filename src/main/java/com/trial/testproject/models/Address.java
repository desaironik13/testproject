package com.trial.testproject.models;

import java.util.UUID;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.datafaker.Faker;
import org.jeasy.random.annotation.Exclude;

@Getter
@Setter
@NoArgsConstructor
public class Address {

	@Exclude
	private UUID personId;
	private UUID addressId; 
	private String streetName = new Faker().address().streetAddress();
	private String unitName = new Faker().address().streetAddressNumber();
	private String city =  new Faker().address().city();
	private String state = new Faker().address().state();
	private String country = new Faker().address().country();
	private String zip = new Faker().address().zipCodePlus4();


	public Address(UUID personId) {
		this.personId = personId;
	}

}

package gov.irs.testproject.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import gov.irs.testproject.models.Address;
import gov.irs.testproject.models.CreditCard;
import gov.irs.testproject.models.PersonWithAddress;
import org.jeasy.random.EasyRandom;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import gov.irs.testproject.models.PersonInfo;


@RestController
public class PersonController {
	EasyRandom generator = new EasyRandom();

	@PostMapping("/personInfo")
	PersonWithAddress generatePersonInfo(@RequestParam("numberOfRecords") Optional<Integer> numberOfRecods) {
		PersonWithAddress personWithAddress = new PersonWithAddress();
		List<PersonInfo> personInfos =  generator.objects(PersonInfo.class, numberOfRecods.orElse(10)).collect(Collectors.toList());
		List<Address> addresses = new ArrayList<>();
		List<CreditCard> creditCards = new ArrayList<>();
		personWithAddress.setPersonInfo(personInfos);
		personInfos.stream().map(personInfo -> personInfo.getPersonId())
				.collect(Collectors.toList())
				.forEach(personId-> generator.objects(Address.class, (int) ( Math.random() * 2 + 1)).forEach(address -> {address.setPersonId(personId);
				addresses.add(address);}));
		personWithAddress.setAddresses(addresses);

		addresses.forEach(address -> generator.objects(CreditCard.class, 1)
				.forEach(creditCard -> {
					creditCard.setPersonId(address.getPersonId());
					creditCard.setAddressId(address.getAddressId());
					creditCards.add(creditCard);
				}));
		personWithAddress.setCreditCards(creditCards);
		return personWithAddress;
	
	}
}

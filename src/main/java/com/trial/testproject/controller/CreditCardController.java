package com.trial.testproject.controller;

import com.trial.testproject.models.CreditCard;
import com.trial.testproject.models.PersonInfo;
import org.jeasy.random.EasyRandom;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@RestController
public class CreditCardController {
	EasyRandom generator = new EasyRandom();

	@PostMapping("/creditCard")
	List<CreditCard> generateCreditCardInfo(@RequestParam("numberOfRecords") Optional<Integer> numberOfRecods) {
//		PersonWithAddress personWithAddress = new PersonWithAddress();
		List<CreditCard> creditCards =  generator.objects(CreditCard.class, numberOfRecods.orElse(10)).collect(Collectors.toList());
//		List<Address> addresses = new ArrayList<>();
//		List<CreditCard> creditCards = new ArrayList<>();
//		personWithAddress.setPersonInfo(personInfos);
//		personInfos.stream().map(personInfo -> personInfo.getPersonId())
//				.collect(Collectors.toList())
//				.forEach(personId-> generator.objects(Address.class, (int) ( Math.random() * 2 + 1)).forEach(address -> {address.setPersonId(personId);
//				addresses.add(address);}));
//		personWithAddress.setAddresses(addresses);
//
//		addresses.forEach(address -> generator.objects(CreditCard.class, 1)
//				.forEach(creditCard -> {
//					creditCard.setPersonId(address.getPersonId());
//					creditCard.setAddressId(address.getAddressId());
//					creditCards.add(creditCard);
//				}));
//		personWithAddress.setCreditCards(creditCards);
		return creditCards;
	
	}
}

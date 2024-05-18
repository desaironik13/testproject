package gov.irs.testproject.models;

import java.util.UUID;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jeasy.random.annotation.Exclude;

@Getter
@Setter
@NoArgsConstructor
public class CreditCard {

	@Exclude
	private UUID personId;
	@Exclude
	private UUID addressId;
	private UUID creditCardId;

	private String creditCardCompany; 

}

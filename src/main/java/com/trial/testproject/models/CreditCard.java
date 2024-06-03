package com.trial.testproject.models;

import java.util.UUID;

import com.trial.testproject.annotations.IntegerDataCreator;
import com.trial.testproject.annotations.processors.IntegerDataCreatorProcessor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jeasy.random.annotation.Exclude;

@Getter
@Setter
public class CreditCard {

	@Exclude
	private UUID personId;

    @IntegerDataCreator(max = 999, min = 100)
	private Integer creditCardNumber;

    public CreditCard() throws Exception {
        super();
        IntegerDataCreatorProcessor.generateInteger(this);
    }

}

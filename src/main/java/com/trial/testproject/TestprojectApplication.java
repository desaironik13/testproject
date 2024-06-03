package com.trial.testproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

import static java.util.Map.entry;

@SpringBootApplication
public class TestprojectApplication {
	public static Map<Integer, Integer> SSNS = Map.ofEntries(
			entry(1,1000),
			entry(2,2000),
			entry(3,3000),
			entry(4,4000),
			entry(5,5000),
			entry(6,6000),
			entry(7,7000),
			entry(8,8000),
			entry(9,9000),
			entry(10,10000),
			entry(11,11000),
			entry(12,12000)

	);

	public static Map<String, Object> CONSTANT_VALUES =  Map.ofEntries(
	entry("SSNS",SSNS)
	);

	public static void main(String[] args) {
		SpringApplication.run(TestprojectApplication.class, args);
	}

}

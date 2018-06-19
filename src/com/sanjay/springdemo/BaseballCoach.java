package com.sanjay.springdemo;

public class BaseballCoach implements Coach {
	
	// private field for dependency
	private FortuneService fortuneService;
	
	// Define the constructor for fortune service
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// Use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}
}

/**
 * 
 */
package com.sanjay.springdemo;

/**
 * @author SANJAY
 *
 */
public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	// Create no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: Inside no-arg constructor");
	}

	// Setter method to inject dependency
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: Inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes.";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
}

package com.sanjay.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// Load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve bean from the Spring Container
		Coach coach = context.getBean("myCoach", Coach.class);
		
		// Call methods on the bean
		System.out.println(coach.getDailyWorkout());
		
		
		// let's call our new method for fortune
		System.out.println(coach.getDailyFortune());
		
		
		// close the context
		context.close();
	}

}

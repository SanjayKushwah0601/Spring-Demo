/**
 * 
 */
package com.sanjay.springdemo;

/**
 * @author SANJAY
 *
 */
public class HappyFortuneService implements FortuneService {

	/* (non-Javadoc)
	 * @see com.sanjay.springdemo.FortuneService#getFortune()
	 */
	@Override
	public String getFortune() {
		return "Today is your lucky day!!!";
	}

}

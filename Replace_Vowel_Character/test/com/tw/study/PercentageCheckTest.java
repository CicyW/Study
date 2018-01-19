package com.tw.study;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PercentageCheckTest {
	
	@Test
	public void IsPercentageTrue(){
		PercentageCheck check = new PercentageCheck();
		Double percentage = 0.5;
		assertEquals(percentage,check.calculate("abce"));
	}
	
	@Test
	public void IsOutOfThreshold(){
		PercentageCheck check = new PercentageCheck();
		assertEquals(true,check.checkpercentage("abce"));
	}
}

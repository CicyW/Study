package com.tw.practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberTest {
	
	@Test
	public void shouldreturn4A0BWhenInputDifferentNumber(){
		Number number = new Number("1234");
		assertEquals("4A0B",number.compare("1234"));		
	}
	
	@Test
	public void shouldreturn0A4BWhenInputDifferentNumber(){
		Number number = new Number("1234");
		assertEquals("0A4B",number.compare("4321"));		
	}
	
	@Test
	public void shouldreturn1A2BWhenInputDifferentNumber(){
		Number number = new Number("1234");
		assertEquals("1A2B",number.compare("1325"));		
	}
	
	@Test
	public void shouldreturn0A0BWhenInputDifferentNumber(){
		Number number = new Number("1234");
		assertEquals("0A0B",number.compare("5678"));
	}
}

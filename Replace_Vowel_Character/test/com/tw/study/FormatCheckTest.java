package com.tw.study;
import static org.junit.Assert.*;

import org.junit.Test;

public class FormatCheckTest {
	

	@Test
	public void IsConsistOfCharacter(){
		FormatCheck identity = new FormatCheck();
		assertEquals(true,identity.checkcharacter("Abcd"));
	}
	
	@Test
	public void IsContainBlank(){
		FormatCheck identity = new FormatCheck();
		assertEquals(true,identity.checkblank("abc "));
	}
	
	@Test
	public void IsContainMajuscule(){
		FormatCheck identity = new FormatCheck();
		assertEquals(true,identity.checkmajuscule("Aa"));
	}
	
	@Test
	public void IsFormat(){
		FormatCheck identity = new FormatCheck();
		assertEquals(true,identity.checkformat("adcb"));
		
	}		
}

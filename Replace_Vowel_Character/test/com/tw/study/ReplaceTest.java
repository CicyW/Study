package com.tw.study;
import static org.junit.Assert.*;

import org.junit.Test;

public class ReplaceTest {
	
	@Test
	public void ContinuousReplace(){
		Replace replace = new Replace();
		assertEquals("mommybcmommy",replace.replacevowel("aebce"));
	}
	
	@Test
	public void DisperseResplace(){
		Replace replace = new Replace();
		assertEquals("mommybmommycmommy",replace.replacevowel("abeci"));
	}
}

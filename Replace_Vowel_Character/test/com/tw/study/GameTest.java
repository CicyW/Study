package com.tw.study;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.*; 

@RunWith(MockitoJUnitRunner.class)
public class GameTest {
	
    @Mock
	private FormatCheck check_format;
    @Mock
	private PercentageCheck check_percentage;
    @Mock
	private Replace replace;
    @Mock
	private Printer printer;
    @Mock
	private Reader reader; 
    
	@Test
	public void ShouldOutPutFormatErrorWhenInputDigit(){
        Game game = new Game(check_format,check_percentage,replace,reader,printer);
        Mockito.when(reader.inputreader()).thenReturn("1234");
        Mockito.when(check_format.checkformat("1234")).thenReturn(false);
        game.start();
        Mockito.verify(printer, Mockito.times(1)).print("please input a string:");
        Mockito.verify(printer, Mockito.times(1)).print("Invalid Input");
	}
	
	@Test
	public void ShouldOutPutFormatErrorWhenInputBlank(){
        Game game = new Game(check_format,check_percentage,replace,reader,printer);
        Mockito.when(reader.inputreader()).thenReturn("abc ");
        Mockito.when(check_format.checkformat("abc ")).thenReturn(false);
        game.start();
        Mockito.verify(printer, Mockito.times(1)).print("please input a string:");
        Mockito.verify(printer, Mockito.times(1)).print("Invalid Input");
	}
	
	@Test
	public void ShouldOutPutFormatErrorWhenInputMajuscule(){
        Game game = new Game(check_format,check_percentage,replace,reader,printer);
        Mockito.when(reader.inputreader()).thenReturn("Abc ");
        Mockito.when(check_format.checkformat("Abc ")).thenReturn(false);
        game.start();
        Mockito.verify(printer, Mockito.times(1)).print("please input a string:");
        Mockito.verify(printer, Mockito.times(1)).print("Invalid Input");
	}
	
	@Test
	public void ShouldOutPutOriginStringWhenInputPercentageLessthanThreshold(){
        Game game = new Game(check_format,check_percentage,replace,reader,printer);
        Mockito.when(reader.inputreader()).thenReturn("bcce");
        Mockito.when(check_format.checkformat("bcce")).thenReturn(true);
        Mockito.when(check_percentage.checkpercentage("bcce")).thenReturn(false);
        game.start();
        Mockito.verify(printer, Mockito.times(1)).print("please input a string:");
        Mockito.verify(printer, Mockito.times(1)).print("The perentage of vowel character is less than 30%");
        Mockito.verify(printer, Mockito.times(1)).print("bcce");        
	}
	
	@Test
	public void ShouldOutPutNewStringWhenInputPercentageLargethanThreshold(){
        Game game = new Game(check_format,check_percentage,replace,reader,printer);
        Mockito.when(reader.inputreader()).thenReturn("bece");
        Mockito.when(check_format.checkformat("bece")).thenReturn(true);
        Mockito.when(check_percentage.checkpercentage("bece")).thenReturn(true);
        Mockito.when(replace.replacevowel("bece")).thenReturn("bmmonnycmommy");
        game.start();
        Mockito.verify(printer, Mockito.times(1)).print("please input a string:");
        Mockito.verify(printer, Mockito.times(1)).print("The new string is");
        Mockito.verify(printer, Mockito.times(1)).print("bmmonnycmommy");        
	}
}

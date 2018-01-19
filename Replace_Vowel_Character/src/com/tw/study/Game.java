package com.tw.study;


public class Game {
	
	private FormatCheck check_format;
	private PercentageCheck check_percentage;
	private Replace replace;
	private Printer printer;
	private Reader reader;
	
	 public Game(FormatCheck check_format,PercentageCheck check_percentage, Replace replace,Reader reader, Printer printer) {
	        this.printer = printer;
	        this.reader = reader;
		 	this.check_format = check_format;
		 	this.check_percentage = check_percentage;
		 	this.replace = replace;
    }
		
	public void start(){
	//	while(true){
			printer.print("please input a string:");
			String str = reader.inputreader();
			if(!check_format.checkformat(str)){
				printer.print("Invalid Input");
				printer.print(str);
			}else{
				if(!check_percentage.checkpercentage(str)){
					printer.print("The perentage of vowel character is less than 30%");
					printer.print(str);
				}else{
					printer.print("The new string is");
					printer.print(replace.replacevowel(str));
				}
			}
		}
	//}

}

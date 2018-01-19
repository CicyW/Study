package com.tw.study;

public class PercentageCheck {
	
	
	public Double calculate(String str){
		int count = 0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
				count = count + 1;
			}
		}
		Double percentage = count*1.0/str.length();
		return percentage;
	}
	
	public boolean checkpercentage(String str){
		Double percentage = calculate(str);
		Double threshold = new Double(0.3);
		boolean flag = false;
		if(percentage.compareTo(threshold)>0)
			flag = true;
		return flag;			
	}
}

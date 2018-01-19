package com.tw.study;

public class FormatCheck {
	
	public boolean checkcharacter(String str){
		boolean isword = str.matches("[a-zA-Z]+");
		return isword;
	}
	
	public boolean checkblank(String str){
		boolean blank = (str.indexOf(" ")!=-1);
		return blank;
	}
	
	public boolean checkmajuscule(String str){
		boolean majuscule = false;
		for(int i=0;i<str.length();i++){
			if(Character.isUpperCase(str.charAt(i))){
				majuscule = true;
				break;
			}
		}		
		return majuscule;
	}
	
	public boolean checkformat(String str){
		boolean formatflag = false;
		if(checkcharacter(str)){
			if(!checkblank(str)&&!checkmajuscule(str))
				formatflag = true;
		}
		return formatflag;
	}
}

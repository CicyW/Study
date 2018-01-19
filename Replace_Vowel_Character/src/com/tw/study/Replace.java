package com.tw.study;

public class Replace {
	 	
	public String replacevowel(String str){
		boolean replaceflag = false;
		String newstr = "";
		for(int i=0;i<str.length();i++){
			if((str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')&&(replaceflag==false)){
				newstr = newstr +  "mommy";
				replaceflag = true;
			}else {
				if(str.charAt(i)!='a'&&str.charAt(i)!='e'&&str.charAt(i)!='i'&&str.charAt(i)!='o'&&str.charAt(i)!='u'){
					newstr = newstr + str.substring(i, i+1);
					replaceflag = false;
				}

			}
		}
		
		return newstr;
	}
}

package com.biz.grade;

public class Array_02 {

	public static void main(String[] args) {
		
		String[] strNations = new String[5];
		
		strNations[0] = "대한민국";
		strNations[1] = "우리나라";
		strNations[2] = "Republic of Korea";
		strNations[3] = "Viva Korea";
		strNations[4] = "우리나라만세";

		for(int i = 0 ; i < 5 ; i++) {
			System.out.println(strNations[i]);
		}
		
		String strNation = "";
		for(int i = 0 ; i < 5 ; i++) {
			strNation += strNations[i] +"\t";
		}
		System.out.println(strNation);
	
		
	}
	
}





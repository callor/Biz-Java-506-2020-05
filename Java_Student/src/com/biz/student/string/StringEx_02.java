package com.biz.student.string;

public class StringEx_02 {

	public static void main(String[] args) {
		
		String strNation = "Republic of Korea";
		
		// strNation에 담긴 문자열에서 9 <= x < 11 범위의 문자열을 잘라서
		// subNation에 담아라
		String subNation = strNation.substring(9,11);
		System.out.println(subNation);
		
		// 문자열 개수가 몇개냐?
		int strLength = strNation.length();
		
		// strNation 문자열을 1글자씩 잘라서 콘솔에 보이기
		for(int i = 0 ; i < strLength ; i++) {
			String s = strNation.substring(i,i+1);
			System.out.println(s);
		}
		
		// 문자열을 한글자씩 분해하여 문자 배열로 변환하여 charNations에 저장하라
		char[] charNations = strNation.toCharArray();
		for(int i = 0 ; i < charNations.length ; i++) {
			System.out.print(charNations[i] + "\t");
		}
		System.out.println();
		
		// 문자열을 한글자씩 분해하여 문자열 배열로 변환하여 strNations에 저장하라
		String[] strNations = strNation.split("");
		for(int i = 0 ; i < strNations.length ; i++) {
			System.out.print(strNations[i] + "\t");
		}
		
	
		
	}
	
}

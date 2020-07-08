package com.biz.bank.config;

public class Lines {

	public static String dLine = "";
	public static String sLine = "";
	/*
	 * static 클래스에서 static으로 선언된 필드변수들의 값을
	 * 설정하고 싶을때 사용하는 static 생성자
	 */
	static {
		for(int i = 0 ; i < 100 ; i++) {
			dLine += "=";//==================
			sLine += "-";//------------------
		}
	}
	
}

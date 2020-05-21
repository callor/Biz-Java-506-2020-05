package com.biz.hello;

public class VarString_02 {
	public static void main(String[] args) {
	
		// 문자열형 변수를 선언하고, 
		// 대한민국 이라는 문자열을 할당(대입)하고
		String str1 = "대한민국";
		
		// str1문자열 변수에 저장된 문자열을
		// Console에 보여라
		System.out.println(str1);
		
		String str2 = "은 우리나라";
		
		// 문자열의  plus(+) 연산
		// 문자열은 특이하게 숫자가 아니지만
		// 덧셈 연산을 수행할 수 있다.
		// 문자열을 연결시키는 연산
		System.out.println(str1 + str2);
		
		// 문자열은 플러스(+) 연산만을 수행할수 있다.
		// System.out.println(str1 * str2);
		// System.out.println(str1 - str2);
		// System.out.println(str1 / str2);
	
	}
}

package com.biz.hello;

public class VarString_05 {

	public static void main(String[] args) {
		int num1 = 0;
		float num2 = 0;
		
		num1 = (int)num2; // 강제형변환, 명시적 형변환
		num2 = num1; // 자동형변환, 묵시적 형변환
		
		// 문자열형을 정수형 변수에 저장하는 것은
		// 매우 특별한 경우를 제외하고는 불가능하다.
		// num1 = "대한민국";
		
		/*
		 * '문자' 를 정수형변수에 담기
		 * '문자'는 IT기기에서 정보(데이터)를 주고받는데 필요한
		 * 코드값을 취급하는 type이다
		 * '문자'를 정수형 변수에 담으면 '문자' 고유의 코드값이
		 * 10진수로 변환되어 정수형 변수에 담기게 된다.
		 */
		num1 = 'A';
		System.out.println(num1);
		num1 = 'B';
		System.out.println(num1);
		
		num1 = 'a';
		System.out.println(num1);
		num1 = 'b';
		System.out.println(num1);
		
		// 문자 'A'를 문자열로 변환하고
		// 문자열 "A"과 연결하여 str1에 저장하라
		// 문자 'A'를 문자열변수에 바로 저장하지 못하는 것은
		// character 특성상 내부적으로 10진수형식으로 저장되기 때문이다
		String str1 = 'A' + "A";
		System.out.println(str1);
		
		str1 = ('A' + 0) + "A";
		System.out.println(str1);
		
	}
}

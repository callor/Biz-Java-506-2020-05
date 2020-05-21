package com.biz.hello;

public class VarString_03 {
	
	public static void main(String[] args) {
		int num1 = 30;
		String str1 = "나이";
		
		// 문자열형변수에 담긴 str1 문자열 리터럴과
		// 정수형변수 num1에 담긴 숫자값 30을
		// plus연산하여
		// 문자열형 변수 sum에 저장하고
		// sum에 저장된 문자열형 리터럴을 Console에 보여라
		String sum = str1 + num1;
		sum = num1 + str1;
		System.out.println(sum);
		/*
		 * 문자열형(변수, 리터럴) + 문자열 이외의 형 의 연산을 수행하면
		 * 문자열 이외의 형을 모두 문자열로 변환하고
		 * 문자열형 연결 연산을 수행한다.
		 */
		
		float num2 = 30.2f;
		
		// 문자열형 + 실수 => 문자열형 + 문자열형변환
		// 두 리터럴을 연결하여 문자열형 변수 sum에 할당
		sum = num2 + str1;
		System.out.println(sum);
		
		System.out.println(3 + "+"); // "3" + "+"
		System.out.println(3 + "+" + 5 + "=" + 3+5);
		System.out.println(3 + "+" + 5 + "=" + (3+5));
		
		
		
	}

}

package com.biz.hello;

public class VarBoolean_01 {
	
	public static void main(String[] args) {
		System.out.println(3 == 3); // true
		System.out.println(3 > 3); // false
		System.out.println(3 < 3); // false
		System.out.println(3 >= 3); // true
		System.out.println(3 != 3); // false
		
		/*
		 * boolean 대수
		 * 어떤 값 A,B 2개가 각각 true이거나 false 
		 * 경우의 값만 가질수 있는 경우
		 * 이 값을 boolean 형 이라고 표현을 한다.
		 * boolean형인 A,B를 OR 연산을 수행하면
		 * 결과는 아래와 같다
		 * ================================
		 * A  	OR  B		C
		 * ---------------------------------
		 * false	false	false
		 * false	true	true
		 * true		false	true
		 * true		true	true
		 * =================================
		 * A  	AND  B		C
		 * ---------------------------------
		 * false	false	false
		 * false	true	false
		 * true		false	false
		 * true		true	true
		 * =================================
		 */
		
	}
}

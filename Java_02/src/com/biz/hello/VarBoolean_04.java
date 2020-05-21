package com.biz.hello;

public class VarBoolean_04 {
	
	public static void main(String[] args) {
		/*
		 * boolean형 변수
		 * boolean형 변수는 오로지 true, false중 1가지 값만을
		 * 가지는 특별한 변수
		 * 
		 * boolean형 변수, 값
		 * 혼자서 어떤 연산을 수행하기 보다는
		 * 다른 키워드와 조합하여 연산 명령을 수행하는 용도로 주로 사용된다.
		 */
		boolean bVar1 = false;
		boolean bVar2 = false;
		
		int num1 = 34;
		bVar1 = (num1 % 2) == 0; // num1가 even OR odd ?
		
		System.out.println(++num1 + "는 짝수 ? " 
				+ ((num1 % 2) == 0));
		System.out.println(++num1 + "는 짝수 ? " 
				+ ((num1 % 2) == 0));
		System.out.println(++num1 + "는 짝수 ? " 
				+ ((num1 % 2) == 0));
		System.out.println(++num1 + "는 짝수 ? " 
				+ ((num1 % 2) == 0));
		System.out.println(++num1 + "는 짝수 ? " 
				+ ((num1 % 2) == 0));
		System.out.println(++num1 + "는 짝수 ? " 
				+ ((num1 % 2) == 0));
		System.out.println(++num1 + "는 짝수 ? " 
				+ ((num1 % 2) == 0));
		
		
		
		
	}
}

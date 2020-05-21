package com.biz.hello;

public class Hello_01 {

	/*
	 * 컴퓨터에서 숫자의 취급
	 * 숫자는 컴퓨터 메모리에 임시로 저장이 되고
	 * 연산처리가 되는데
	 * 메모리 저장 공간의 구조에 따라
	 * 저장할 수 있는 수의 크기가 정해진다.
	 * 정수는 32비트의 공간에 부호를 제외한 31비트 크기만큼의
	 * 음수와 양수를 저장할수 있다.
	 * 
	 * 실수는 32비트 공간에 특별한 방법으로 저장을 하는데
	 * 소수점 이하의 값을 연산(자르기등)의 방법을 통해
	 * 저장을 한다.
	 * 
	 * 실수는 소수점이하 16자리까지 최대 표현할수 있으며
	 * 17자리 이후는 잘라버려서 오차가 된다.
	 * 
	 */
	public static void main(String[] args) {
		
		System.out.println("대한민국만세");
		System.out.println( 30 + 40 );
		System.out.println( 30.0 + 40.0 );
		
		System.out.println( 40 / 30 );
		System.out.println( 40.0 / 30.0 );
		System.out.println(1000_000_000_0000L);
		
		
	}

}

package com.biz.test;

public class WrapperEx {

	public static void main(String[] args) {
		
		/*
		 * Primitive
		 * Java언어에 공식적으로 내장된 변수선언문
		 * 어떤 값을 메모리에 저장하는 용도로 변수를 선언하는 명령문
		 * 특별한 기능을 수행하지 않고, 메모리의 주소를 이름으로 대치하여 사용하는 용도
		 * 
		 */
		int n1;
		float f1;
		double d1;
		boolean b1;
		char c1;
		long l1;
		
		/*
		 * wrapper 클래스
		 * primitive 변수처럼 사용할수 있는 특별한 클래스들
		 */
		
		Integer num1 = new Integer(10);
		
		/*
		 * int 형의 값 20을 Integer형 num2 객체에 할당(저장)
		 * 일반적인 클래스는 이러한 문법을 절대 사용할수 없다.
		 * wrapper클래스는 primitive 데이터와 서로 주고받는 관계가 성립된다.
		 * int 형 값 20을 Integer 형 num2 객체에 할당을 하면
		 * 내부적으로 자동으로 int형을 Integer형으로 Boxing한다. 
		 */
		Integer num2 = 20;
		/*
		 * num2 객체를 num3인 primitive 변수에 저장(할당)
		 * 일반 클래스에서는 불가능하지만
		 * wrapper 클래스에서는 가능하며
		 * 클래스를 값으로 벗겨내어 일반 변수에 저장
		 * unBoxing 기능
		 */
		int num3 = num2;
		
		Integer sum = num1 + num2;
		
		
		
	}
	
	
}

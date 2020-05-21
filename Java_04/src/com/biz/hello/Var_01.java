package com.biz.hello;

public class Var_01 {

	public static void main(String[] args) {
		
		int num1 = 30;
		int num2 = 40;
		
		System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
		/*
		 * println() method는 괄호안의 내용을 Console에 표시하는 기능을 수행
		 * 
		 * 숫자 + 문자열 형태는 모두 문자열로 변환 한후 연결하여 표시를 한다.
		 * 간단한 표시형식은 쉽게 작성하여 Console에 표시할수 있는데
		 * 조금 복잡한 모양(형태)는 + 기호가 계속 반복되는 형태이어서
		 * 오류가 발생할 확률이 높고, 다소 어려움이 있다.
		 * 
		 * 자바에서는 이러한 어려움을 해소하기 위해서 
		 * printf() method를 준비해 두었다.
		 * print form, print format 이라고 하며
		 * printf() 괄호안에 첫번째에 형식문자열 구조를 만들고
		 * 이어서 컴마(,)로 연결하여 형식문자열에 포함할 값을 추가해 주면
		 * 쉽게 문자열 모양을 만들어 Console에 표시할 수 있다.
		 */
		System.out.printf("%d + %d = %d",num1,num2,(num1+num2));
		
		
		
	}
}

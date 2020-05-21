package com.biz.hello;

public class Var_05 {
	public static void main(String[] args) {
		/*
		 * 변수의 성질
		 * 명령문이 위에서 아래로 진행되면서
		 * 변수에 어떤 값을 할당하면
		 * 이전에 보관 되어 있던 값은 무조건 삭제된다.
		 */
		int num1 = 0;
		
		num1 = 40;
		num1 = 30;
		num1 = 50;
		
		System.out.println(num1);
		
	}

}

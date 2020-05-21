package com.biz.hello;

public class VarBoolean_03 {
	
	public static void main(String[] args) {
		int num1 = 33;
		int num2 = 55;
		
		if( (num1+num2) % 2 == 0 ) {
			System.out.println("덧셈결과는 짝수");
		}
		if( (num1-num2) % 2 == 0 ) {
			System.out.println("뺄셈결과는 짝수");
		}
		if( (num1*num2) % 2 == 0 ) {
			System.out.println("곱셈결과는 짝수");
		}
		if( (num2/num1) % 2 == 0 ) {
			System.out.println("나눗셈결과는 짝수");
		}
		
		

		
	}

}

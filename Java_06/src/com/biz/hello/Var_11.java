package com.biz.hello;

public class Var_11 {

	public static void main(String[] args) {
		
		int sum = 0 ;
		for(int i = 1; i <= 100; i++) {
			
			// 3의 배수이면서 6의 배수이면
			// && : AND 
			// || : OR
			if(i % 3 == 0 && i % 6 == 0) {
				sum += i;
			}
		}
		System.out.println("3의 배수이면서 6의 배수인 정수들의 합" + sum);
		
	}
	
}

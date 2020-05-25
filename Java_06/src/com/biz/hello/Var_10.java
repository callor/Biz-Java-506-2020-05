package com.biz.hello;

public class Var_10 {
	
	public static void main(String[] args) {
		
		int sum = 0 ;
		for(int i = 1 ; i <= 100 ; i++) {
			
			// 3배수 또는 5의 배수 이면
			if(i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println("3 또는 5의 배수의 합 : " + sum);
	}

}





package com.biz.hello;

public class Var_08 {
	public static void main(String[] args) {

		int sum = 0;
		for(int i = 2 ; i <= 100;i++) {
			
			int j = 2 ;
			for(j = 2; j < i ; j++) {
				if(i % j == 0) {
					break;
				}
			}
			
			if(i == j) {
				System.out.println(i + "는 소수");
				sum += i;
			}
		} // for(i)끝나는곳
		System.out.println("총합 :" + sum);
		
	}
}

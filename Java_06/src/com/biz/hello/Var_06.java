package com.biz.hello;

public class Var_06 {

	public static void main(String[] args) {
		
		// 2 ~ 100까지 반복
		for(int i = 2 ; i <= 100 ; i++) {
			
			int j = 2;
			// 2부터 i - 1까지 반복
			for(j = 2 ; j < i ; j++) {
				if(i % j == 0) {
					break;
				}
			}
			if(i == j) {
				System.out.println(i + "는 소수");
			}
		}
	}
}

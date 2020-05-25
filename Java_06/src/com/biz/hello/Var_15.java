package com.biz.hello;

import java.util.Random;

public class Var_15 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int sum = 0;
		for(int i = 0 ; i < 100 ; i++) {
			int num = rnd.nextInt(100);
			int j = 2;
			for(j = 2; j < num ; j++) {
				if(num % j == 0) {
					break;
				}
			}
			if(num == j) {
				System.out.println(num + "는 소수");
				sum += num;
			}
		}
		System.out.println("소수들의 합 :" +sum);
		
	}
	
}

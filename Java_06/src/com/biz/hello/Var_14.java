package com.biz.hello;

import java.util.Random;

public class Var_14 {

	public static void main(String[] args) {
		Random rnd = new Random();
		
		int sum = 0;
		for(int i = 0 ; i < 100 ; i++) {
			int num = rnd.nextInt(100) + 1;
			if(num % 2 == 0) {
				sum += num;
			}
		}
		System.out.println("100개의 임의 수중 짝수인 수들의 합 : " + sum);
		
		
		
	}
	
}

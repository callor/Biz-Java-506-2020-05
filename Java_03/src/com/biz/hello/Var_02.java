package com.biz.hello;

import java.util.Random;

public class Var_02 {
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int num1 = rnd.nextInt(100)+1;
		int num2 = rnd.nextInt(100)+1;
		int num3 = rnd.nextInt(100)+1;
		int num4 = rnd.nextInt(100)+1;
		int num5 = rnd.nextInt(100)+1;
		
		if( (num1 + num2) % 2 == 0) {
			System.out.println(num1 
					+ "+" 
					+ num2 
					+ "=" +
					(num1 + num2)
					+ "는 짝수");
		}
		
		if(num1 >= num2) {
			
		}
		
		
		

	}
}

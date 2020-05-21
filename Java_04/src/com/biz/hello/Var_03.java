package com.biz.hello;

import java.util.Random;

public class Var_03 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int num1 = rnd.nextInt(100) + 1;
		int num2 = rnd.nextInt(100) + 1;
		
		System.out.printf("%d + %d = %d\n",num1,num2,num1 + num2);
		System.out.printf("%d - %d = %d\n",num1,num2,num1 - num2);
		System.out.printf("%d x %d = %d\n",num1,num2,num1 * num2);
		System.out.printf("%d / %d = %d\n",num1,num2,num1 / num2);
		
		
	}
	
	
	
}

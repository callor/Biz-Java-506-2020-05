package com.biz.hello;

import java.util.Random;

public class Var_03 {
	
	public static void main(String[] args) {
		Random rnd = new Random();
		int num = (rnd.nextInt(10)+1) * 100;
		
		System.out.println("VAT 포함가격 : " + num);
		System.out.println("VAT 별도가격 : " + (int)(num/1.1));
		System.out.println("VAT : " + (num - (int)(num/1.1)));
	
	}

}

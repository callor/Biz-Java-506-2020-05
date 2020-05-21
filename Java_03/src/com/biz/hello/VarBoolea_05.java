package com.biz.hello;

import java.util.Random;

public class VarBoolea_05 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int num1 = rnd.nextInt(100);
		boolean bVar = (num1 % 2) == 0;
		
		if(bVar) {
			System.out.println(num1 +"은 짝수");	
		}
		if(!bVar) {
			System.out.println(num1 +"은 짝수가 아님");
		}
	
	}
}

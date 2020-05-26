package com.biz.grade;

import java.util.Random;

public class Grade_13 {
	
	public static void main(String[] args) {
		
		int[] intNum = new int[100];
		Random rnd = new Random();
		for(int i = 0 ; i < 100 ; i++) {
			intNum[i] = rnd.nextInt(100) + 1;
		}
		
		int intSum = 0 ;
		for(int i = 0 ; i < 100 ; i++) {
			if(intNum[i] % 3 == 0 || intNum[i] % 5 == 0) {
				intSum += intNum[i];
			}
		}
		
		System.out.println("3 또는 5의 배수의 합 : " + intSum);
		
		
		
		
		
		
		
	}

}

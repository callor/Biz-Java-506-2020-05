package com.biz.grade;

import java.util.Random;

public class Grade_12 {

	public static void main(String[] args) {
		
		int[] intNum = new int[10];
		
		Random rnd = new Random();
		for(int i = 0 ; i < 10 ; i++) {
			intNum[i] = rnd.nextInt(50) + 51;
		}

		int intSum = 0;
		for(int i = 0 ; i <  10 ; i++) {
			if(intNum[i] % 2 == 0) {
				intSum += intNum[i];
			}
		}
		System.out.println("짝수들의 합 : " + intSum);
	}
}

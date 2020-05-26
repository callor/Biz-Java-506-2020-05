package com.biz.grade;

import java.util.Random;

public class Grade_10 {
	public static void main(String[] args) {
		
		int[] intKor = new int[10];
		int[] intEng = new int[10];
		int[] intMath = new int[10];
		
		Random rnd = new Random();
		for(int i = 0 ; i < 10 ; i++) {
			intKor[i] = rnd.nextInt(50) + 51;
			intEng[i] = rnd.nextInt(50) + 51;
			intMath[i] = rnd.nextInt(50) + 51;
		}
		
		int intKorSum = 0;
		int intEngSum = 0;
		int intMathSum = 0;
		
		for(int i = 0 ; i < 10 ; i++) {
			intKorSum = intKor[i];
			intEngSum = intEng[i];
			intMathSum = intMath[i];
		}
		
		System.out.println("======================================");
		System.out.println("학생 성적리스트");
		System.out.println("--------------------------------------");
		System.out.println("학번\t국어\t영어\t수학\t총점");
		System.out.println("--------------------------------------");
		for(int i = 0 ; i < 10 ; i++) {
			System.out.printf("%d\t%d\t%d\t%d\t%d\n",
					i+1,
					intKor[i], 
					intEng[i], 
					intMath[i],
					intKor[i] + intEng[i] + intMath[i]);
		}
		System.out.println("=======================================");
		System.out.printf("\t%d\t%d\t%d\t%d\n",
								intKorSum, 
								intEngSum, 
								intMathSum,
								intKorSum + intEngSum + intMathSum);
		System.out.println("=======================================");
	}
	
}











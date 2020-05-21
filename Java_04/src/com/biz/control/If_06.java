package com.biz.control;

import java.util.Random;

public class If_06 {

	public static void main(String[] args) {
		Random rnd = new Random();
		
		int intKor = rnd.nextInt(100);
		int intEng = rnd.nextInt(100);
		int intMath = rnd.nextInt(100);
		
		int sum = intKor + intEng + intMath;
		int avg = sum / 3;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);

		// 평균이 60점 이상이면 합격 아니면 불합격
		if(avg >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
		
	}
	
}

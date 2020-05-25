package com.biz.hello;

import java.util.Random;

public class Var_19 {

	public static void main(String[] args) {
		float korScore ;
		float engScore ;
		float mathScore ;
		
		Random rnd = new Random();

		int num = rnd.nextInt(500) + 501;
		korScore = (float)num / 10;
		
		num = rnd.nextInt(500) + 501;
		engScore = (float)num / 10;
		
		num = rnd.nextInt(500) + 501;
		mathScore = (float)num / 10;

		float sum = korScore + engScore + mathScore;
		float avg = sum / 3;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
	}
	
}

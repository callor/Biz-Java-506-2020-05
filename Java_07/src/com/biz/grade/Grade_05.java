package com.biz.grade;

import java.util.Random;

public class Grade_05 {

	public static void main(String[] args) {
		
		int intKor_01 = 0 ;
		int intKor_02 = 0 ;
		int intKor_03 = 0 ;
		int intKor_04 = 0 ;
		int intKor_05 = 0 ;
		int intKor_06 = 0 ;
		int intKor_07 = 0 ;
		int intKor_08 = 0 ;
		int intKor_09 = 0 ;
		int intKor_10 = 0 ;
		
		Random random = new Random();
		intKor_01 = random.nextInt(50) + 51;
		intKor_02 = random.nextInt(50) + 51;
		intKor_03 = random.nextInt(50) + 51;
		intKor_04 = random.nextInt(50) + 51;
		intKor_05 = random.nextInt(50) + 51;
		intKor_05 = random.nextInt(50) + 51;
		intKor_07 = random.nextInt(50) + 51;
		intKor_08 = random.nextInt(50) + 51;
		intKor_09 = random.nextInt(50) + 51;
		intKor_10 = random.nextInt(50) + 51;
		
		int intSum = intKor_01;
		intSum += intKor_02;
		intSum += intKor_03;
		intSum += intKor_04;
		intSum += intKor_05;
		intSum += intKor_06;
		intSum += intKor_07;
		intSum += intKor_08;
		intSum += intKor_09;
		intSum += intKor_10;
		
		System.out.println("1번 학생 국어점수 : " + intKor_01);
		System.out.println("2번 학생 국어점수 : " + intKor_02);
		System.out.println("3번 학생 국어점수 : " + intKor_03);
		System.out.println("4번 학생 국어점수 : " + intKor_04);
		System.out.println("5번 학생 국어점수 : " + intKor_05);
		System.out.println("6번 학생 국어점수 : " + intKor_06);
		System.out.println("7번 학생 국어점수 : " + intKor_07);
		System.out.println("8번 학생 국어점수 : " + intKor_08);
		System.out.println("9번 학생 국어점수 : " + intKor_09);
		System.out.println("10번 학생 국어점수 : " + intKor_10);
		
		System.out.println("총점 : " + intSum);
		System.out.println("평균 : " + intSum/10);
		
	}
	
}

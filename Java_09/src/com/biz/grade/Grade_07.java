package com.biz.grade;

import com.biz.score.Student;

public class Grade_07 {

	public static void main(String[] args) {
		
		Student 홍길동 = new Student();
		Student 이몽룡 = new Student();
		Student 성춘향 = new Student();
		
		홍길동.strName = "홍길동";
		홍길동.intAge = 38;
		홍길동.strTel = "010-111";
		
		이몽룡.strName = "이몽룡";
		이몽룡.intAge = 27;
		이몽룡.strTel = "010-222";

		성춘향.strName = "성춘향";
		성춘향.intAge = 16;
		성춘향.strTel = "010-333";

		System.out.println("홍길동 이름 : " 
				+ 홍길동.getName());
		System.out.println("홍길동 나이 : " 
				+ 홍길동.getAge());
		System.out.println("홍길동 전화 : " 
				+ 홍길동.getTel());
		
		System.out.println("이몽룡 이름 : " + 이몽룡.getName());
		System.out.println("이몽룡 나이 : " + 이몽룡.getAge());
		System.out.println("이몽룡 전화 : " + 이몽룡.getTel());

		System.out.println("성춘향 이름 : " + 성춘향.getName());
		System.out.println("성춘향 나이 : " + 성춘향.getAge());
		System.out.println("성춘향 전화 : " + 성춘향.getTel());
	}
	
}






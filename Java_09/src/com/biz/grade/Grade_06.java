package com.biz.grade;

import com.biz.score.Student;

public class Grade_06 {
	
	public static void main(String[] args) {
		
		String strName = "홍길동";
		strName = "이몽룡";
		String strN = strName;
		System.out.println(strN);
		
		int intAge = 27;
		String strTel = "010-333-3333";
		System.out.println(intAge);
		System.out.println(strTel);
				
		Student st = new Student();
		st.make();
		strN = st.getName();
		System.out.println(strN);
		
		intAge = st.getAge();
		strTel = st.getTel();
		System.out.println(intAge);
		System.out.println(strTel);
		
	}

}

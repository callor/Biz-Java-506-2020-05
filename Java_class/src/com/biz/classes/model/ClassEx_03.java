package com.biz.classes.model;

public class ClassEx_03 {

	public static void main(String[] args) {
		
		Student student = new Student();
		// 현재 Student와 ClassEx_03 이 같은 패키지내에 있으므로
		// 접근제한자가 없는 rem은 public으로 인식되어
		// 값을 저장하거나 읽을 수 있다
		student.rem ="접근제한자가 없는 변수";
		
	}
	
}

package com.biz.addr.exec;

public class NewClass_03 {

	/*
	 * 만약 클래스에 임의의 필드생성자가 필요로 하고
	 * 객체를 초기화할때 기본생성자도 사용하고 싶을때는
	 * 필드생성자와 함께
	 * 비어있는(blank)  기본 생성자도 만들어 주어야 한다.
	 * 
	 * new NewClass_03() // 기본생성자 호출하여 객체 초기화
	 * new NewClass_03(0) // 필드생성자 호출하여 객체 초기화
	 * 
	 * 
	 */
	public NewClass_03() {
	}
	
	public NewClass_03(int num) {
	}
	
}

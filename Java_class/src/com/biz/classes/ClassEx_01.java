package com.biz.classes;

/*
 * 클래스(class)
 * Java 언어를 사용하여 코딩을 할때 가장 기본적인 파일의 단위
 * 
 * 클래스의 이름짓기
 * 첫글자는 반드시 영문대문자, 
 * 두번째 영문대소문자, 숫자, _ 를 사용할수 있다.
 * 한글로도 작성할수 있지만 대소문자 구분문제로 잘 사용하지는 않는다.
 * 클래스 = 파일이름 
 * 한개의 파일에는 한개의 클래스만 작성하는 것이 좋다.
 * 
 * 클래스 중에서 main() method가 있는 클래스는 Run을 했을때
 * 제일먼저 코드가 실행되는 곳
 * main() mehtod를 진입점, 시작점 이라고 한다.
 * 
 * main() method가 없는 클래스는 혼자서는 코드작동이 되지 않는다.
 * 
 */
public class ClassEx_01 {
	
	public static void main(String[] args) {
		
		// 코드가 실행된다 
		// = 코드가 컴파일되어 내부적으로 연산이 이루어진다.
		int num1 = 10;
		int num2 = 20;
		System.out.println(num1 + num2);
		
	}

}





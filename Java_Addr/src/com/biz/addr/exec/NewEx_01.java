package com.biz.addr.exec;

public class NewEx_01 {
	
	public static void main(String[] args) {
		
		// NewClass_01 클래스에는 기본생성자를 임의로 만들지 않았지만
		// 자동으로 기본생성자가 선언이 되므로
		// 생성자를 호출하여 nc 객체를 초기화 할수 있다.
		NewClass_01 nc = new NewClass_01();
		
		// NewClass_02 클래스에는 
		// int num값을 매개변수로 주입받아야 하는
		// 		필드 생성자를 임의로 작성해 두었다.
		// 필드 생성자를 임의로 작성을 하게 되면
		//		클래스의 기본생성자는 삭제된다.
		// 따라서 이 클래스는
		//		new NewClass_02() 생성자를 호출하여 객체를 초기화 할수 없게 된다.
		// 생성자를 호출하여 객체를 초기화 하려면 매개변수로 임의 숫자를 주입해 주어야 한다.
		NewClass_02 nc2 = new NewClass_02(3);
		
		
	}
	

}

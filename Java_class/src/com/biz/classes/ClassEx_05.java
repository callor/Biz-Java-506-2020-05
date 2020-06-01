package com.biz.classes;

import com.biz.classes.model.Address;

public class ClassEx_05 {

	public static void main(String[] args) {

		// Address클래스를 addr인스턴스로 생성
		Address addr = new Address();
		
		// addr인스턴스를 통해서 getAge() 메서드를 호출하고
		// getAge() 메서드가 return 한 값을 age라는 변수를 선언하여
		// 저장하기
		int age = addr.getAge(); // age값을 setting 하기전에 읽음, 값은 0이 나온다
		addr.setAge(22);
		System.out.println(age);
		// 클래스에 선언된 method들은 클래스에 선언된 순서는 아무런 영향이 없다
		// 인스턴스를 만들고 인스턴스를 통해서 호출되는 순서대로
		// 코드가 작동이 된다.
		
		
		
		
		
		
	}
	
	
}



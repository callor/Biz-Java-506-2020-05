package com.biz.cars;

import com.biz.classis.Car;

public class CarMake_01 {

	public static void main(String[] args) {
		
		/*
		 * Car 클래스에는 전진(), 후진(), 멈춤() 등과 같은 method코드가 있다.
		 * Car 클래스를 사용해서 소나타, 그랜져, 아우디 객체(인스턴스)를 
		 * 		생성하게 되면
		 * 
		 * 소나타.전진(), 그랜져.후진(), 아우디.좌() 와 같은 방법으로
		 * 명령을 수행할수 있게 된다.
		 * 
		 * Car 클래스(키트,Kit)를 한번만 작성하게 되면
		 * 현재 프로젝트에서는 어디에서든, 얼마든지 Kit를 사용하여
		 * (객체) 인스턴스를 만들고 Car 클래스에 작성되어 있는
		 * method 들을 호출(사용)하여 명령문을 수행할수 있다.
		 */
		
		Car 소나타 = new Car();
		Car 그랜져 = new Car();
		Car 아우디 = new Car();
		
		소나타.전진();
		그랜져.후진();
		아우디.좌();
		
		String 내자동차 = "소나타";
		if(내자동차 == "소나타") {
			System.out.println("자동차가 전진합니다");
		}
		
		내자동차 = "그랜져";
		if(내자동차 == "그랜져") {
			System.out.println("자동차가 후진합니다");
		}
		
		
	}
}






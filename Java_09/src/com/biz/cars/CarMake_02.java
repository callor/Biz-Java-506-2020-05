package com.biz.cars;

import com.biz.classis.Car;

/*
 * 1. 이 클래스에는 main() method가 있다.
 * 2. main() method는 진입점, 시작점 method라고 한다.
 * 3. 이 클래스는 이클클립스에서 실행(Run) 을 하게 되면
 * 		main() method에 작성된 명령문들이 차례로 실행이 된다.
 * 
 */
public class CarMake_02 { // 클래스 선언문
	
	public static void main(String[] args) { // main() 메서드 선언문
		
		System.out.println("CarMake_02 클래스 시작하는 곳");
		
		int sum ; // 변수선언문
				
		// Car 클래스를 사용하여 소나타, 그랜져, 아우디 객체를 생성
		Car 소나타 = new Car();
		Car 그랜져 = new Car();
		Car 아우디 = new Car();
		
		소나타.전진();
		그랜져.후진();
		
		소나타.자동차이름 = "나의 소나타";
		소나타.전진();
		
		그랜져.자동차이름 = "요즘 잘나가는 성공한사람이 타는 차";
		그랜져.후진();
		
		/*
		 * Car 라는 클래스는 Kit로서 역할을 수행하도록 작성된 코드이다
		 * Car 라는 클래스에 선언된 method 들은 직접 사용할수 없다.
		 * Car 라는 클래스를 사용하여 내자동차 라는 객체를 생성하고
		 * 내자동차.method() 형식으로 명령을 사용해야 한다.
		 */
		Car 내자동차 = new Car();
		내자동차.전진();
		
		
		
	}

}

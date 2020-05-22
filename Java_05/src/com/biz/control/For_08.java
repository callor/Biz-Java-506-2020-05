package com.biz.control;

public class For_08 {

	public static void main(String[] args) {
		int num = 0;
		for(num = 0 ; num < 5 ; num++) {
			System.out.println("* * * * *");
		}
		// for()가 시작될때 i 변수를 선언하고 0으로 clear를 한후
		// 계속 반복 실행
		for(int i = 0, sum = 0; i <= 10 ; i++) {
			sum += i;
		}
		/*
		 * for() 명령문의 초기화명령에서 변수를 선언하면
		 * 그 변수는 for() {  } scope를 벗어나는 순간 소멸된다.
		 * 따라서 for() { } 명령문 밖에서는 변수를 참조(읽기, 쓰기)를
		 * 할수 없다.
		 */
		// System.out.println("결과:" + sum);
		
		/*
		 * 1부터 10까지 덧셈을 수행하는 코드를 작성하면서
		 * 덧셈 결과를 담아서 for() 명령문이 종료된 후에
		 * 결과를 Console에 보이기 위해서는 sum변수는 for명령문
		 * 이전에 선언과 초기화(Clear)를 해주어야 한다.
		 * 
		 * for(int i = 0;;) for()명령문에서 초기화영역에서
		 * 선언된 변수는 for() 명령문이 종료되면 소멸되어 버린다.
		 * 따라서 for() {  } 명령문 에서만 임시로 사용할 변수를
		 * 선언하는 영역으로 사용한다.
		 */
		int sum = 0;
		for(int i = 0; i <= 10 ; i++) {
			sum += i;
		}
		System.out.println("결과:" + sum);
		
		
	}
}

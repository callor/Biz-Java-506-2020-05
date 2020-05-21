package com.biz.control;

import java.util.Random;

public class If_05 {

	public static void main(String[] args) {
		Random rnd = new Random();
		int num1 = rnd.nextInt(100) + 1;
		/*
		 * if(조건1) {
		 * 
		 * } else if(조건2)
		 * 
		 * } else {
		 * 
		 * }
		 * 
		 * 여러가지 조건중에서 1가지 조건에 해당하는 결과를 찾고자 할때
		 * 		사용하는 명령문 구조이며
		 * 만약 조건1이 true인 경우 나머지 조건은 
		 * 		다시 연산을 수행하지 않는다
		 * 
		 */
		if(num1 % 5 == 0) {
			System.out.printf("%d 는 5의 배수\n",num1);
		} else if(num1 % 4 == 0) {
			System.out.printf("%d 는 4의 배수\n",num1);
		} else if(num1 % 3 == 0) {
			System.out.printf("%d 는 3의 배수\n",num1);
		} else if(num1 % 2 == 0) {
			System.out.printf("%d 는 2의 배수\n",num1);
		} else {
			System.out.printf("%d는 5, 4, 3, 2 의 배수가 아니다");
		}
		
		
		
		
	}
	
	
}

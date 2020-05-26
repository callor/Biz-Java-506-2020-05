package com.biz.grade;

import java.util.Random;

public class Grade_09 {
	
	public static void main(String[] args) {

		int num_1 = 0;
		int num_2 = 0;
		for(int i = 1 ; i <= 2 ; i++) {
			/*
			 * for() 가 반복되면서 사용되는 변수 i를 다른변수에 부착하여
			 * 아래와 같이 사용하면
			 * num_1 = 90 이라는 코드로 바뀌어 사용할수 있을 것 같은데
			 * 문법상 이 코드는 num_i라는 변수를 찾는 코드로 변환되어
			 * sysntax오류를 발생한다.
			 * 이러한 코드는 사용이 불가능하다.
			 */
			// num_i = 90;
		}
		
		// 정수값을 저장할 배열 100개를 생성하라(선언과 초기화를 동시에 수행한다)
		int[] intKorScore = new int[100];
		
		// 배열 100개에 임의 점수 51 ~ 100까지 값을 채워 넣기
		Random rnd = new Random();
		for(int i = 0 ; i < 100; i++) {
			intKorScore[i] = rnd.nextInt(50) + 51;
		}
		
		// 배열 100개에 담겨있는 값을 intSum변수에 더하여 총점구하기
		int intSum = 0;
		for(int i = 0 ; i < 100 ; i++) {
			intSum += intKorScore[i] ;
		}
		
		// 배열 100개에 담겨있는 값을 List로 보여주기
		for(int i = 0 ; i < 100 ; i++) {
			System.out.println(i + "번째 점수 : " + intKorScore[i]);
		}
		
		// 계산된 총점과 평균을 Console에 보여주기
		System.out.println("총점 :" + intSum);
		System.out.println("평균 :" + intSum/100);
		
	}

	
	
	
	
}

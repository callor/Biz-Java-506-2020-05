package com.biz.control;

public class For_07 {
	
	
	public static void main(String[] args) {
	
		// 1부터 100까지의 숫자중 짝수만의 합
		
		// 짝수만의 합
		// sum += 짝수들
		// 1씩 증가되고 있는 num변수의 값이 짝수일때만 sum에 저장
		int num = 0;
		int sum = 0;
		for(num = 0, sum = 0; num <= 100 ; num++) {
			if(num % 2 == 0) {
				sum += num;	
			}
		}
		System.out.println("결과:" + sum);

		for(num = 0, sum = 0; num <= 100 ; num+=2) {
			sum += num;
		}
		System.out.println("결과:" + sum);
		
		// 1부터 100까지 숫자중 3의 배수의 합
		for(num = 0, sum = 0; num <= 100 ; num++) {
			if(num % 3 == 0) {
				sum += num;	
			}
		}
		System.out.println("결과:" + sum);

		

		
		
	}

}

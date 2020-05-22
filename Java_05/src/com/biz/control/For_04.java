package com.biz.control;

public class For_04 {

	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		
		for( ;; ) {
			num++;
			sum = sum + num;
			if(num >= 10) {
				break;
			}
		}
		System.out.println("결과:" + sum);
	}
	
}

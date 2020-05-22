package com.biz.control;

public class For_03 {

	public static void main(String[] args) {
		int num = 0;
		for( ;; ) {
			num++;
			System.out.println(num);
			if(num > 10) {
				break;
			}
		}

		System.out.println("=========================");
		num = 0;
		for( ;; ) {
			num++;
			if(num > 10) {
				break;
			}
			System.out.println(num);
		}

	
	
	}
	
}

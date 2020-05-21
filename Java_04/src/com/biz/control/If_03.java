package com.biz.control;

import java.util.Random;

public class If_03 {
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int num1 = rnd.nextInt(100) + 1;
		
		if(num1 % 2 == 0) {
			System.out.printf("%d 은(는) 짝수입니다\n",num1);
		}
		if(num1 % 2 != 0) {
			System.out.printf("%d 은(는) 짝수가 아닙니다\n",num1);
		}
		
		if(num1 % 3 == 0) {
			System.out.printf("%d 는 3의 배수입니다\n",num1);
		}
		if(num1 % 3 != 0) {
			System.out.printf("%d는 3의 배수가 아닙니다\n",num1);
		}
		
		if(num1 % 3 == 0) {
			System.out.printf("%d 는 3의 배수입니다\n",num1);
		} else {
			System.out.printf("%d 는 3의 배수가 아닙니다\n",num1);
		}
		
		if(num1 % 2 == 0) {
			System.out.printf("%d 는 짝수입니다\n",num1);
		} else {
			// System.out.printf("%d 는 홀수입니다\n",num1);
			System.out.printf("%d 는 짝수가 아닙니다\n",num1);
		}
		
		if(num1 % 2 == 1) {
			System.out.printf("%d 는 홀수입니다\n",num1);
		} else {
			System.out.printf("%d 는 홀수가 아닙니다\n",num1);
		}
		
		/*
		 * 실제 코딩을 하는 과정에서 흔히 발생하는 문제들
		 * 이론상으로 어떤 수의 4의 배수를 2의 배수라고 하여도 문제가 없다
		 * 하지만 이 코드는 코딩 원칙상 bug를 유발할 가능성이 있는 코드라고
		 * 한다.
		 * if(조건문) 형식의 코드를 작성할때는
		 * 조건문에 따라 얻어지는 정답을 확인하고
		 * 조건문이 정답을 정확히 찾아낼수 있도록 코딩하여야 한다.
		 */
		if(num1 % 4 == 0) {
			System.out.printf("%d 는 2의 배수입니다\n",num1);
		}
		
	}
}

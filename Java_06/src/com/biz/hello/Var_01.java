package com.biz.hello;

import java.util.Random;

public class Var_01 {

	public static void main(String[] args) {
		Random rnd = new Random();
		int num = rnd.nextInt(100) + 1;
		if(num % 3 == 0) {
			System.out.println(num + "는 3의 배수");
		} else if(num % 5 == 0) {
			System.out.println(num + "는 5의 배수");
		}
	}
}

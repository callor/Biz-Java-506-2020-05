package com.biz.pay;

public class Pay_01 {

	public static void main(String[] args) {

		int pay = 3_432_320;
		int paper = 50000;

		// 스위치변수(토글변수)
		int sw = 1;
		while (pay > 0) {

			int count = pay / paper;
			System.out.printf("%d 원권 : %d\n", paper, count);
			pay -= (paper * count);

			/*
			if (sw > 0) {
				paper /= 5; //
			} else {
				paper /= 2;
			}
			// sw = 1, -1, 1
			sw = sw * - 1;
			sw *= (-1);
			*/
			
			// 
			if(sw == 1) {
				paper /= 5;
				sw = 0;
			} else {
				paper/=2;
				sw = 1 ;
			}
		}

	}

}

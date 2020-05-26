package com.biz.grade;

import java.util.Random;

public class Grade_14 {
	
	public static void main(String[] args) {
		
		int[] intNums = new int[6];
		Random rnd = new Random();
		
		for(int i = 0 ; i < 6 ; i++) {
			int intNum = rnd.nextInt(45) + 1;
			int index = 0;
			for(index = 0 ; index < 6 ; index++) {
				if(intNums[index] == intNum) {
					break;
				}
			}
			if(index == 6) {
				intNums[i] = intNum;
			}
		}
		for(int i = 0 ; i < 6 ; i++) {
			System.out.println(intNums[i]);
		}
	}

}

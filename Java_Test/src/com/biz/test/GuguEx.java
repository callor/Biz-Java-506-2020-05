package com.biz.test;

import java.util.Random;

/*
 * 구구단 7단을 출력하는 코드를 작성
 */
public class GuguEx {
	
	 public static void main(String[] args) {
		 
		 String dLine = String.format("%020d", 0).replace("0","=");
		 Random rnd = new Random();
		 int num = rnd.nextInt(9) + 1;
		 
		 System.out.println(dLine);
		 System.out.println("7단 구구단");
		 System.out.println(dLine);
		 for(int i = 0 ; i < 9 ; i ++) {
			 System.out.printf("%d x %d = %d\n",num,(i+1), num * (i+1));
		 }
		 System.out.println(dLine);
	}
}

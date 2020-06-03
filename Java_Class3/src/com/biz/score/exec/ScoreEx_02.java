package com.biz.score.exec;

public class ScoreEx_02 {

	public static void main(String[] args) {
		
		int[] num = new int[3];
		num[0] = 90;
		num[1] = 80;
		num[2] = 70;
		System.out.printf("%d\t%d\t%d\n",num[0],num[1],num[2]);
		
		/*
		 * 코드 실행이 진행되는 동안에 배열의 개수는
		 * 일반적으로 변경하지 않는다.
		 * 배열의 개수를 변경하게 되면
		 * 기존의 배열은 사라지고 새로운 개수의 배열이 만들어진다.
		 */
		num = new int[5];
		System.out.printf("%d\t%d\t%d\n",num[0],num[1],num[2]);
		
		
	}
}

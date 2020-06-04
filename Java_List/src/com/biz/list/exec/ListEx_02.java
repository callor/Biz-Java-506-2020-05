package com.biz.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListEx_02 {

	public static void main(String[] args) {
		
		// size() 가 0인 intList 새로 생성된다.
		List<Integer> intList = new ArrayList<Integer>();
		Random rnd = new Random();
		
		int sum  = 0;
		int num = rnd.nextInt();
		for(int i = 0 ; i <100 ; i++) {
			// 1~100까지 난수(임의숫자)를 발생하여
			int num1 = rnd.nextInt(100) + 1;
			
			// intList에 추가하기
			intList.add(num1);
			
		}
		// size() 100이 되고 정수값이 100개 추가된 intList 된다.
		
		for(int i = 0 ; i < 100 ; i++) {
			// i번째 위치의 값을 읽어서 sum변수에 누적하라
			sum += intList.get(i);
			// intList[ i ]
		}
		System.out.println("합계:" + sum);
		
	}
	
}

package com.biz.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListEx {

	public static void main(String[] args) {
		
		// List형은 클래스를 제네릭으로 포함을 한다.
		// List에는 Primitive형은 포함할 수 없다.
		// List<int>
		List<Integer> intList = new ArrayList<Integer>();
		Random rnd = new Random();
		
		for(int i = 0 ; i < 100 ; i++) {
			
			// int형 데이터를 Integer형으로 강제 Boxing을 수행하기
			// Integer num = Integer.valueOf(rnd.nextInt());
			
			// 자동으로 int형 데이터가 Integer형으로 Boxing이 이루어진다.
			Integer num = rnd.nextInt();
			// int num = rnd.nextInt();
			intList.add(num);
		}
		
		int sum = 0;
		// int size = intList.size();
		for(Integer num : intList) {
			// Integer형인 num 에 담긴 값이 다시 int형으로
			// 자동 unBoxing이 되면서 값이 누적된다.
			sum += num;
		}
		System.out.println("합계: " + sum);
		
		
		
		
	}
	
}

package com.biz.score.exec;

import java.util.ArrayList;
import java.util.List;

public class ScoreEx_04 {

	public static void main(String[] args) {
		List<String> strList = new ArrayList<String>();
		
		strList.add("대한민국만세");
		strList.add("우리나라만세");
		strList.add("Republic of Korea");
		
		// get() method는 index에 해당하는 정수값을
		// 	매개변수로 주입(전달)해 주어야 하고
		// 	다른 변수에 값을 복사해 올수 있는 구조다
		String s1 = strList.get(0);
		String s2 = strList.get(1);
		String s3 = strList.get(2);
		
		System.out.println(s1);
		
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(900);
		
		int num1 = nums.get(0);
		System.out.println(num1);
		System.out.println(  nums.get(0)  );
		
		
		
		
	}
}




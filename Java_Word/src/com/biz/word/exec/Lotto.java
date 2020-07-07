package com.biz.word.exec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto {

	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<Integer>();
		for(int i = 0 ; i < 45 ; i++) {
			intList.add(i+1);
		}
		Collections.shuffle(intList);
		System.out.println("행운을 드립니다 !!!");
		for(int i = 0 ; i < 6 ; i++) {
			System.out.print(intList.get(i) + "\t");
		}
		System.out.println("\n꼭 부자되세요");
	}
}

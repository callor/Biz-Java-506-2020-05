package com.biz.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListEx_03 {

	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<Integer>();
		Random rnd = new Random();
		
		for(int i = 0 ; i < 100 ; i++) {
			intList.add(rnd.nextInt(100) + 1) ;
		}
		
		int count = 0;
		for(int i = 0 ; i < 100 ; i++) {
			int num = intList.get(i);
			if(num % 2 == 0) {
				System.out.printf("%d\t", num );
				count++;
				if(count % 5 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println("\n짝수의 개수 : " + count);
		
		
		
		
	}
}

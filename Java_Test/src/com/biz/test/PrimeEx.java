package com.biz.test;

import java.util.Random;

public class PrimeEx {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] nums = new int[10];
		
		for(int i = 0 ; i < nums.length ;i++) {
			/*
			 * nextInt(91) : 0 ~ 90까지의 정수생성
			 * 결과에 +10을 하면 10 ~ 100까지의 정수가 생성
			 * 그 값을 배열의 각 요소에 저장(할당)
			 */
			nums[i] = rnd.nextInt(91) + 10;
		}
		
		/*
		 * 소수(prime)
		 * 1과 자기자신 이외의 수로는 나누어지지 않는 수
		 */
		for(int i = 0 ; i < nums.length ; i++) {
			// System.out.println(nums[i]);
			
			// j 반복문이 끝났을때 j값을 비교하는 용도로 사용하기 위해
			// for 문 시작전에 변수를 선언했다.
			int j = 0;
			for(j = 2 ; j < nums[i] ;j++) {
				
				/*
				 * 반복문 중간에 이 조건문이 한번이라도 true가 되면
				 * nums[i] 에 저장된 값은 소수가 아니다.
				 */
				if(nums[i] % j == 0) {
					// j 반복문을 중단하기
					break;
				}
			} // j 반복문 end
			
			// 중간 break문을 만나서 여기 도착했으면 nums[i] 에 저장된 값은 소수가 아니다.
			// 중간에 break문을 만나게 되면 항상 j 값은 nums[i] 에 저장된 값보다 작다.
			if( j < nums[i] ) {
				System.out.println(nums[i] + " : 소수가 아니다");
			} else {
				// j 반복문이 모두 반복되고 여기 도착했으면 nums[i] 에 저장된 값은 소수가 된다.
				// j 반복문이 모두 반복되면 for 반복문의  j < nums[i] 조건에 위배되어 반복문이 종료되고
				// j 값은 == nums[i] 가 된다.
				// 이러한 조건문은 코딩상 썩 좋은 코드가 아니다
				// 확실한 조건문인 j < nums[i]를 if문으로 감싸서 비교를 수행하는 것이 좋다.
				System.out.println(nums[i] + " : 소수 ");
			}
		}
	}

}

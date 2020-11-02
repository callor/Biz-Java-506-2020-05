package com.biz.pay;

public class Pay {

	public static void main(String[] args) {
		
		// 숫자 표시할때 3자리마다 _ 를 넣어서 자릿수 구분할 수 있다.
		int pay = 3_323_333;
		
		int paper = 50000;
		
		// 5만원 / 5
		// 1만원 / 2
		// 5천원 / 5
		// 1천원 / 2
		// 5백원 / 5
		// 1백원 / 2
		// 50원 / 5
		// 10원 / 5
		// 5원 / 2
		// 1원
		
		// pay를 paper(5만원)으로 나누고 그 결과를 정수형 변수에 담으면
		// 소수점 이하가 잘려서 실제로 5만원권 매수만 구할수 있다.
		int count = pay / paper ;
		System.out.println(count);
		
		// 5만원권 매수를 제외한 나머지 금액
		pay = pay - (count * paper);
		paper /= 5;
		
		
		
	}
}

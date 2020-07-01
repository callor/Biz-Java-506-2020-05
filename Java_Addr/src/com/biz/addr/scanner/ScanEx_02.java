package com.biz.addr.scanner;

import java.util.Scanner;

public class ScanEx_02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
			
		// prompt 
		// scanner의 nextLine() method가 실행되어 blocking 상태가 되면
		// 코드 진행이 멈추는데
		// 사용자는 무엇을 어떻게 해야할지 당황스럽게 된다.
		// 이때 nextLine() method를 실행하기 이전에
		// 사용자가 수행할 일을 미리 알려주는 역할을 하는 출력문
		System.out.print("영문자열 입력 >> ");
		
		// 키보드에서 문자열이 입력되기를 기다리고 있다가
		// 문자열이 입력되면 입력된 문자열을 strInput 변수에 담아달라
		
		String strInput = scan.nextLine();
		System.out.println("입력된 문자열 : " + strInput);
	
	}
	
}



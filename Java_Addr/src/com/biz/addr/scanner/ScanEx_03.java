package com.biz.addr.scanner;

import java.util.Scanner;

public class ScanEx_03 {

	public static void main(String[] args) {
		
		/*
		 * Scanner 클래스를 사용하여 객체를 생성하게 되면
		 * 키보드 입력장치의 resource가 소모된다.
		 * 컴퓨터 입장에서는 resource를 사용하는데 있어서 매우 신중해야 한다.
		 * 제한된 resource를 무작위로 사용하게 되면
		 * 컴퓨터 입장에서는 매우 불편하게 된다.
		 * 그래서 일반적으로 어떤 장치와 관련된 resource들은 사용한 후 반드시
		 * 종료를 해주어야 한다.(resource 반납)
		 * 따라서 scanner 도 사용 후에는 반납해 주는 것이 좋다.
		 * 
		 * 단, 최신 java(JDK)에서는 제한된 사용범위에서는
		 * 반납하지 않아도 GC(Gabage Collection)에 의해 반납 처리가 되기는 한다.
		 */
		Scanner scan = new Scanner(System.in);
		
		scan.nextLine();
		
		// scanner resource 반납
		scan.close();
		
	}
	
}

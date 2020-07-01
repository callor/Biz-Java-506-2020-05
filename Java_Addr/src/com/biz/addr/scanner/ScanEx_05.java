package com.biz.addr.scanner;

import java.util.Scanner;

public class ScanEx_05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자1 >> ");
		int num1 = scan.nextInt();
		
		System.out.print("숫자2 >> ");
		int num2 = scan.nextInt();
		System.out.printf("%d + %d = %d " , num1, num2, num1 + num2);
		
		/*
		 * InputStream의 문제로 인하여
		 * 숫자를 scan 하는 nextInt() method를 수행한 후
		 * 곧바로 이어서 문자열을 scan 하는 nextLine() method를 수행하면
		 * 내부 메커니즘 문제로 인하여 Buffer에 Enter 코드가 남아 있다가
		 * 곧바로 nextLine() method에게 전달되어 버린다.
		 * 이때문에 nextInt()를 수행한 후 nextLine()를 수행하면
		 * 의도하지 않게 코드가 진행된다.
		 * 
		 * 이 문제를 해결하기 위해 
		 * scanner 통해 키보드 입력을 받기 위해서는 nextLine()만 사용하자
		 * 그럼 숫자는??
		 * 
		 */
		System.out.print("문자열 입력 >> ");
		String strInput = scan.nextLine();
		System.out.println("입력된 문자열 : " + strInput);
		
		scan.close();
		
	}
	
}

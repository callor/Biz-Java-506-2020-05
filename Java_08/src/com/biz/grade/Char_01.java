package com.biz.grade;

public class Char_01 {

	public static void main(String[] args) {
		
		// 작은 따옴표로 묶여있는 문자 1글자를 저장할수 있는 변수
		// 문자를 저장할때 문자의 코드값(ASCII)을 10진수, 또는 2진수로 변환하여
		// 저장하며, 저장된 코드값은 int 형 타입과 매우 유사
		char charA = 'A';
		char charZ = 'Z';
		
		System.out.println(charA);
		System.out.println(charZ);

		// char형 변수에 담겨있는 코드값을 정수형변수에 담게 되면
		// 문자가 실제 10진수 코드값으로 변경되어 저장한다.
		int intA = charA;
		int intZ = charZ;
		
		System.out.println(intA);
		System.out.println(intZ);
		
		for(int i = 'A' ; i <= 'Z' ;i++) {
			
			// %c 정수형 변수에 저장된 값을 문자로 바꾸어서 보여달라는 기호
			// %d 정수형 변수에 저장된 값을 10진수로 보여달라는 기호
			System.out.printf("%c : %d\n", i, i);
		}
		
		for(int i = 'a' ; i <= 'z' ; i++) {
			System.out.printf("%c : %d\n", i, i);
		}
		
		for(int i = '0' ; i <= '9' ; i++) {
			System.out.printf("%c : %d\n", i , i);
		}
		
		int intCount = 0;
		for(int i = '0' ; i < 'z' ; i++) {
			System.out.printf("%c : %d\t\t",i , i);
			if(++intCount % 5 == 0) {
				System.out.println();
			}
		}
		// ASCII 코드중에  키보드의 Enter키 : 13, ESC 키 : 27
		
		
	}
}








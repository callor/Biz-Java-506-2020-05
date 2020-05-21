package com.biz.hello;

public class VarBoolean_02 {
	
	public static void main(String[] args) {
		
		// boolean형 변수를 선언하고
		// true라는 값을 저장하라. 초기화하라
		boolean bVar1 = true;
		boolean bVar2 = true;
		
		bVar1 = 3 == 3;
		
		// 3 > 3의 비교연산을 수행하여 결과를 bVar2에 저장하라
		bVar2 = 3 > 3;
		System.out.println(bVar2);
		
		bVar1 = 3 < 3;
		System.out.println(bVar1);
		
		bVar1 = 3 >= 3;
		bVar2 = 3 <= 3;
		
		boolean bVar3 = bVar1 == bVar2;
		System.out.println(bVar3);
		
		bVar3 = bVar1 != bVar2;
		System.out.println(bVar3);
		
		bVar1 = 3 >= 3; // true
		bVar2 = 3 > 3; // false
		bVar3 = bVar1 != bVar2;
		System.out.println(bVar3);
		
		// ||(filter, pipe 기호) : OR 연산기호
		bVar3 = bVar1 || bVar2;
		System.out.println(bVar3);
		
		// && : AND 연산기호
		bVar3 = bVar1 && bVar2;
		System.out.println(bVar3);
		
		
	}
}

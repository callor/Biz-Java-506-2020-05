package com.biz.grade;

public class Grade_01 {
	
	/*
	 * 진입점, 시작점 method
	 */
	public static void main(String[] args) {

		/*
		 * 변수의 용도
		 * 기억장치(메모리)의 어딘가에 값을 보관해 두고
		 * 이후에 보관된 값을 읽어서(꺼내서) 다른 연산에 사용하기 위함
		 * 1. 사용하기전에 반드시 선언이 되어 있어야 한다.
		 * 2. 읽기전에 반드시 초기화(어떤 값을 보관하는 절차, 코드)가 
		 * 			되어 있어야 한다.
		 * 3. 초기화가 되지 않은 변수는 저장, 할당, 보관 만 할수 있다
		 * 4. 어떤변수에 보관중인 값은 선언된 또다른 변수로 복사할수 있다.
		 * 5. 선언, 초기화가 된 변수에 어떤 값을 저장하게 되면
		 * 		현재 보관중인 값은 사라지고 새로 저장하는 값으로 대체된다.
		 */
		int intNum = 0; // 변수를 선언하면서 초기화(0을 저장)까지 동시에 수행
		intNum = 90; // 선언된 변수에 값을 저장하기
		
		int intSum = intNum; // intNum 변수에 보관중인 값을 읽어서 intSum에 복사
		intSum = 30;
		
		// 변수 사용에 불가한 코드
		// 1. 변수는 연산자등이 부착되지 않은 상태로 
		//		단독으로 명령문을 이룰수 없다.
		// intNum;
		
		// 2. 변수는 변수 앞이나 뒤에 반드시 할당연산자( = )가 있어야 한다.
		// intNum + ;
		// + intNum ;
		// intNum + 1 ;
		intNum = 3;
		
		intNum += 3;
		intNum = intNum + 3;
		
		intNum ++;
		intNum += 1;
		intNum = intNum + 1;
		
		intSum = intNum;
		
		
		
	}

}






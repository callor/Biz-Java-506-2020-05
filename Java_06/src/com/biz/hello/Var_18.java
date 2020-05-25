package com.biz.hello;

public class Var_18 {

	public static void main(String[] args) {
		
		int intKor = 82;
		int intEng = 77;
		int intMath = 68;
		
		int intSum = intKor + intEng + intMath;
		// 평균을 실수형변수로 선언하여
		// 소수점 이하 점수를 표현하고 한다.
		// 그런데 소수점 이하 값이 표현되기는 하지만
		// 실제 정확한 계산이 되지 않는다.
		// 그 이유는 intSum 이 정수이기 때문에 정수 / 정수를 계산하고
		// 임의 실수(float)으로 변환하기 때문에 오차발생한다.
		// 따라서 결과를 실수형으로 표현하기 위해서는 계산전에
		// 점수를 실수형으로 강제 형변환 해주어야 한다.
		float fAvg = ( (float)intSum / 3 );
		
		System.out.println("총점 : " + intSum);
		System.out.println("평균 : " + fAvg);
		
	}
	
	
}

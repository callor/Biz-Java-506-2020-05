package com.biz.score.service;

import com.biz.score.domain.ScoreVO;

/*
 * 클래스를 상속받아서 작성한다.
 * extends : 확장한다.
 * = inherit : 상속받다.
 * 
 * 자바에서 클래스 상속
 * 자바 객체지향 개념에서 가장 중요한 개념으로
 * 기존에 잘 만들어진 클래스를 상속받아(inherit)서
 * 그 중 일부 method를 나만의 코드로 바꾸어서 사용하고 싶을때
 * 클래스를 확장하여(extends) 참조하고
 * 필요한 method 재정의(Override)하여 사용한다.
 * 
 * 
 */
public class ScoreServiceImplV2 extends ScoreServiceImplV1 {


	/*
	 * 이 곳에는 보이지는 않지만 ScoreSeriviceImplV1의 
	 * 모든 기능(필드변수, 메서드) 복사 붙이기 되어 있는 것과 같다.
	 * extends ScoreSerivceImpl1 명령문을 클래스 뒤에 붙였기 때문에 
	 */
	
	/*
	 * ScoreServiceImplV1의 모든 기능중 scoreList() method의 코드를 
	 * 바꾸어서 작성하고 싶다.
	 * 단, 나머지 기능은 V1의 것을 사용하고 싶다.
	 */
	@Override
	public void scoreList() {
		
		System.out.println("================================================");
		System.out.println("성적일람표 V2");
		System.out.println("================================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("------------------------------------------------");
		for(ScoreVO sVO : scoreList) {
			System.out.print(sVO.getNum() + "\t");
			System.out.print(sVO.getKor() + "\t");
			System.out.print(sVO.getEng() + "\t");
			System.out.print(sVO.getMath() + "\t");
			System.out.print(sVO.getSum() + "\t");
			System.out.println(sVO.getAvg());
		}
		System.out.println("================================================");
	}
	
	
	
}

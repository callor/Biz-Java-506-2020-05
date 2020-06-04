package com.biz.list.exec;

import java.util.ArrayList;
import java.util.List;

import com.biz.list.model.ScoreVO;


public class ScoreEx_01 {

	/*
	 * 클래스를 리스트에 추가하기
	 * 리스트에 클래스 읽기
	 */
	public static void main(String[] args) {
		
		// 1. size() 0 인 리스트를 생성
		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		
		// 2. 클래스를 인스턴스로 선언과 생성
		ScoreVO scoreVO = new ScoreVO();
		
		// 3. 인스턴스의 필드변수에 값을 Setting
		scoreVO.setNum("001");
		scoreVO.setKor(80);
		scoreVO.setEng(70);
		scoreVO.setMath(88);
		
		// 4. 리스트에 추가
		scoreList.add(scoreVO); 
		// size() 1인 리스트에 값이 저장된 인스턴스 추가
		
		// 새로운 인스턴스를 추가할때
		// 5. 선언되어있는 인스턴스를 
		//		반드시 다시 초기화
		scoreVO = new ScoreVO();
		scoreVO.setNum("002");
		scoreVO.setKor(99);
		scoreVO.setEng(88);
		scoreVO.setMath(77);
		scoreList.add(scoreVO);
		
		scoreVO = new ScoreVO();
		scoreVO.setNum("003");
		scoreVO.setKor(77);
		scoreVO.setEng(66);
		scoreVO.setMath(55);
		scoreList.add(scoreVO);

		// 값을 읽을때
		// 1. 리스트에 위치를 지정하여 get(index) method로
		//		인스턴스를 추출하여 다른 인스턴스에 저장
		ScoreVO getScore = scoreList.get(0);
		
		// 2. 인스턴스로 부터 각 필드변수 값을 읽기
		String num = getScore.getNum();
		int kor = getScore.getKor();
		int eng = getScore.getEng();
		int math = getScore.getMath();
		
		// 전체리스트를 추출하기
		int scoreSize = scoreList.size();
		for(int i = 0 ; i < scoreSize ; i++) {
			
			getScore = scoreList.get(i);
			System.out.print( getScore.getNum() + "\t" );
			System.out.print( getScore.getKor() + "\t" );
			System.out.print( getScore.getEng() + "\t" );
			System.out.println( getScore.getMath() );
			
		}
	}
}

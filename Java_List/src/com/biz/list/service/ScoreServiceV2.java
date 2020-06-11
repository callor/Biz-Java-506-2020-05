package com.biz.list.service;

import java.util.List;

import com.biz.list.model.ScoreVO;

public class ScoreServiceV2 {

	List<ScoreVO> scoreList ;
	
	public void stSum(List<ScoreVO> scoreList) {

		/*
		 * 2020-06-11
		 * 
		 * [핵심포인트]
		 * 매개변수로 전달받은 scoreList를
		 * ScoreSeviceV2 클래스의 필드변수인 scoreList(this.scoreList)에 세팅하고
		 * stAvg(), scoreList() 메서드에서는 필드변수로 설정된 scoreList(this.scoreList) 값을 사용하여
		 * 나머지 코드를 수행한다.
		 */
		this.scoreList = scoreList;
		
		int scoreSize = scoreList.size();
		for(int i = 0 ; i < scoreSize ; i++) {
			ScoreVO scoreVO = scoreList.get(i);
			int sum = scoreVO.getKor();
			sum += scoreVO.getEng();
			sum += scoreVO.getMath();
			scoreVO.setStSum(sum);
		}
	}
	
	public void stAvg() {
		
		int scoreSize = scoreList.size();
		for(int i = 0 ; i < scoreSize ; i++) {
			ScoreVO scoreVO = scoreList.get(i);
			int sum = scoreVO.getStSum();
			scoreVO.setStAvg(sum);
		}
		
	}
	public void scoreList() {
		
		int scoreSize = scoreList.size();
		System.out.println("======================================");
		System.out.println("성적리스트");
		System.out.println("--------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		for(int i = 0 ; i < scoreSize ; i++) {
			ScoreVO scoreVO = scoreList.get(i);
			
			System.out.print(scoreVO.getNum() + "\t");
			System.out.print(scoreVO.getKor() + "\t");
			System.out.print(scoreVO.getEng() + "\t");
			System.out.print(scoreVO.getMath() + "\t");
			System.out.print(scoreVO.getStSum() + "\t");
			System.out.println(scoreVO.getStAvg());
		}
		System.out.println("======================================");
		
	}

	
	
	
	
}

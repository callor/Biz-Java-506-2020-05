package com.biz.score.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.score.domain.ScoreVO;

/*
 * ScoreService*** 클래스를 정의할때
 * 반드시 ScoreService interface를 참조(implements)하도록 규칙을 정해 놓는다
 * ScoreService interface를 참조하는 클래스는 ScoreService interface에 디자인된
 * method를 모두 implement해서 작성되어야 하는 규칙이 작동하게 된다.
 * 따라서 모든 method의 이름이 통일되는 효과를 얻게 된다.
 * 
 *  interface(ScoreService)를 implements하여 작성된 클래스는
 *  interface에 정의된 method의 규칙을 그대로 준수하여 작성해야할 의무가 있는 클래스다
 *  모양은 interface의 모양을 그대로 가지고 있으며
 *  하는일은 실제 클래스의 method 에 구현되어있다
 */
public class ScoreServiceImplV1 implements ScoreService {

	// private 되어 있던 필드변수를 protected로 변경했다!!
	protected List<ScoreVO> scoreList;
	protected Scanner scan;
	
	public ScoreServiceImplV1() {
		this.scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
	}
	
	@Override
	public boolean inputScore() {
		
		ScoreVO scoreVO = new ScoreVO();
		
		System.out.print("학번(END:입력종료) >> ");
		String strNum = scan.nextLine();
		scoreVO.setNum(strNum);
		if(strNum.equals("END")) {
			return false;
		}
		
		System.out.print("국어>> ");
		String strKor = scan.nextLine();
		int intKor = 0;
		try {
			intKor = Integer.valueOf(strKor);
		} catch (Exception e) {
			System.out.println("국어점수는 숫자만 가능");
		}
		scoreVO.setKor(intKor);

		System.out.print("영어>> ");
		String strEng = scan.nextLine();
		int intEng = 0;
		try {
			intEng = Integer.valueOf(strEng);
		} catch (Exception e) {
			System.out.println("영어점수는 숫자만 가능");
		}
		scoreVO.setEng(intEng);

		System.out.print("수학>> ");
		String strMath = scan.nextLine();
		int intMath = 0;
		try {
			intMath = Integer.valueOf(strMath);
		} catch (Exception e) {
			System.out.println("수학점수는 숫자만 가능");
		}
		scoreVO.setMath(intMath);
		
		int intSum = scoreVO.getKor();
		intSum +=  scoreVO.getEng();
		intMath += scoreVO.getMath();
		
		scoreVO.setSum(intSum);
		
		float avg = (float)intSum / 3;
		scoreVO.setAvg(avg);
		scoreList.add(scoreVO);
		return true;
	
	}

	@Override
	public void calcSum() {
		int size = scoreList.size();
		for(int i = 0 ; i < size ; i++) {
			ScoreVO sVO = scoreList.get(i);
			int sum = sVO.getKor();
			sum += sVO.getEng();
			sum += sVO.getMath();
			/*
			 * sVO.setSum() method에 총점을 전달하므로써
			 * scoreList에 저장된 요소의 총점 변수에 값을 저장하는 효과를 낸다
			 * 별도로 저장을 해주거나 하는 절차가 필요없다.
			 */
			sVO.setSum(sum);
		}
	}

	@Override
	public void calcAvg() {
		int size = scoreList.size();
		for(int i = 0 ; i < size ; i++) {
			ScoreVO sVO = scoreList.get(i);
			int sum = sVO.getSum();
			float avg = (float)sum / 3;
			sVO.setAvg(avg);
		}
	}

	@Override
	public void scoreList() {
		System.out.println("================================================");
		System.out.println("성적 일람표");
		System.out.println("================================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("------------------------------------------------");
		
		// scoreList개수가 몇개인지 파악하여 변수에 저장
		int size = scoreList.size();
		for(int i = 0 ; i < size ; i++) {
			// list에서 scoreVO를 추출한다
			ScoreVO sVO = scoreList.get(i);
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

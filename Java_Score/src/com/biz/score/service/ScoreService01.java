package com.biz.score.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.score.domain.ScoreVO;

/*
 * 성적을 입력받아서 scoreList 에 저장하고
 * 성적리스트를 출력하는 부분 정의
 */
public class ScoreService01 {

	// 성적리스트를 저장하기 위한 객체
	List<ScoreVO> scoreList;
	
	// 키보드를 사용해서 값들을 입력받기 위한 객체
	Scanner scan;
	
	// scoreList, scan 객체를 선언한 사용할수 있도록
	// 생성자에서 두 객체를 초기화 한다
	// 이과정을 생략하면 NullpointerException이 발생하기 쉽다
	public ScoreService01() {
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
	}
	
	// 한 학생의 성적을 입력받아서 scoreList에 추가하는 method
	// 변경
	// 학생의 성적을 입력받는 과정에서 학번에 END라는 문자열을
	// 입력하게 되면 성적 입력을 중단하도록 변경
	public boolean inputScore() {
		
		System.out.print("학번(END:입력종료) >> ");
		String strNum = scan.nextLine();
		if(strNum.equals("END")) {
			return false;
		}
		
		System.out.print("국어>> ");
		String strKor = scan.nextLine();
		
		int intKor = 0;
		try {
			intKor = Integer.valueOf(strKor);	
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("국어점수는 숫자만 가능!!");
		}
		// intKor 는 0인 상태로 유지가 된다.
		
		System.out.print("영어>> ");
		String strEng = scan.nextLine();
		
		int intEng = 0;
		try {
			intEng = Integer.valueOf(strEng);	
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("영어점수는 숫자만 가능!!");
		}
		// intEng 는 0인 상태로 유지가 된다.

		System.out.print("수학>> ");
		String strMath = scan.nextLine();
		
		int intMath = 0;
		try {
			intMath = Integer.valueOf(strMath);	
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("수학점수는 숫자만 가능!!");
		}
		// intMath 는 0인 상태로 유지가 된다.

		// 키보드에 입력받은 점수를 int형으로 변환하여
		// 변수에 담겨서 온 상태
		// int형으로 변환된 점수를 ScoreVO 에 일단 담기
		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setNum(strNum);
		scoreVO.setKor(intKor);
		scoreVO.setEng(intEng);
		scoreVO.setMath(intMath);

		// 총점계산
		int sum = intKor + intEng + intMath;
		
		// 평균계산을 float형으로 소수점까지 계산하기 위해서
		// 먼저 sum(총점)을 float형으로 변환하고
		// 나눗셈을 수행해서 결과를 도출한다.
		float avg = (float)sum / 3;
		
		scoreVO.setSum(sum);
		scoreVO.setAvg(avg);
		
		// 한학생의 성적 입력받아 vo에 담기 완료
		
		// 한학생의 성적을 list 추가
		scoreList.add(scoreVO);
		return true;
		
	} // inputScore end
	
	public void scoreList() {
		
		System.out.println("===========================================");
		System.out.println("성적 일람표");
		System.out.println("===========================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-------------------------------------------");
		
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
		System.out.println("===========================================");
	}
	
	
	
}

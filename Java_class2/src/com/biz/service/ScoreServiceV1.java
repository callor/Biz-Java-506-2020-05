package com.biz.service;

import com.biz.model.ScoreVO;

public class ScoreServiceV1 {

	public void scoreList(ScoreVO[] scoreList) {
		
		LineService line = new LineService();
		int lineLength = 50;
		
		System.out.println(line.do_line( lineLength ));
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(line.single(  lineLength ));
		int[] stSum = new int[scoreList.length];
		for(int i = 0 ; i < stSum.length ; i++) {
			stSum[i] = scoreList[i].getKor();
			stSum[i] += scoreList[i].getEng();
			stSum[i] += scoreList[i].getMath();
		}
		
		for(int i = 0 ; i < scoreList.length ; i++) {
		
			// for() {  } 내에서 선언된 sum, avg 변수는
			// for() {  } 명령문이 종료되면 이후에 참조할수 없다.
			int sum = scoreList[i].getKor();
			sum += scoreList[i].getEng();
			sum += scoreList[i].getMath();
			int avg = sum / 3;

			System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\n",
					scoreList[i].getName(),
					scoreList[i].getKor(),
					scoreList[i].getEng(),
					scoreList[i].getMath(),
					sum,avg
			);
			System.out.println(line.do_line(  lineLength  ));
		}
		
		
		
		
		
	}
	
	
}

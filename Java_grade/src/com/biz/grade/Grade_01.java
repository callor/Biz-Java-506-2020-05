package com.biz.grade;

import java.util.Random;

/*
 * 학생20명 과목 5과목의 성적처리
 */
public class Grade_01 {

	public static void main(String[] args) {
		
		int stdCount = 5;

		// stdCount 만큼의 배열을 생성
		// 과목수 만큼 생성
		int[] intKor = new int[ stdCount ];
		int[] intEng = new int[ stdCount ];
		int[] intMath = new int[ stdCount ];
		int[] intMusic= new int[ stdCount ];
		int[] intArt = new int[ stdCount ];
		
		// 임의의 점수를 만들기위한 도구 생성
		Random rnd = new Random();
		
		// 학생들의 점수를 임의 생성하여 배열에 저장
		for(int i = 0 ; i < stdCount ; i++) {
			intKor[i] = rnd.nextInt(50) + 51;
			intEng[i] = rnd.nextInt(50) + 51;
			intMath[i] = rnd.nextInt(50) + 51;
			intMusic[i] = rnd.nextInt(50) + 51;
			intArt[i] = rnd.nextInt(50) + 51;
			
			intArt[i] = rnd.nextInt(50) + 51;
			intArt[i] = rnd.nextInt(50) + 51;
			intArt[i] = rnd.nextInt(50) + 51;
			intArt[i] = rnd.nextInt(50) + 51;
			intArt[i] = rnd.nextInt(50) + 51;
			intArt[i] = rnd.nextInt(50) + 51;
			
			
		}
		
		// 학생별 총점, 평균 계산
		
		// 학생별 총점, 평균을 계산하여 저장할 배열 추가 생성
		int[] stdSum = new int[ stdCount ];
		int[] stdAvg = new int[ stdCount ];
		
		// 각학생의 총점, 평균을 계산하여 stdSum, stdAvg 저장
		for(int i = 0 ; i < stdCount ; i++) {
			
			stdSum[i] = intKor[i];
			stdSum[i] += intEng[i];
			stdSum[i] += intMath[i];
			stdSum[i] += intMusic[i];
			stdSum[i] += intArt[i];
			
			stdAvg[i] = stdSum[i] / 5;
			
		}

		// 과목별 총점, 평균 계산
		int intKorSum = 0;
		int intEngSum = 0;
		int intMathSum = 0;
		int intMusicSum = 0;
		int intArtSum = 0;
		
		// 20명 학생의 과목별 총점을 계산
		for(int i = 0 ; i < stdCount ; i++) {
			
			intKorSum += intKor[i];
			intEngSum += intEng[i];
			intMathSum += intMath[i];
			intMusicSum += intMusic[i];
			intArtSum += intArt[i];
			
		}
		
		System.out.println("==============================================================");
		System.out.println("학생 성적일람표");
		System.out.println("--------------------------------------------------------------");
		System.out.println("학번\t국어\t영어\t수학\t음악\t미술\t총점\t평균");
		System.out.println("--------------------------------------------------------------");

		for(int i = 0 ; i < stdCount ; i++) {
			
			System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\n",
					(i+1),
					intKor[i],
					intEng[i],
					intMath[i],
					intMusic[i],
					intArt[i],
					stdSum[i],
					stdAvg[i]
				);
		}
		System.out.println("--------------------------------------------------------------");
		
		int totalSum = intKorSum + intEngSum + intMathSum + intMusicSum + intArtSum;
		int totalAvg = totalSum / 5;
		
		// printf에서 format 기호
		// %d : (Decimal) 정수, 십진수 등을 표현하는 기호
		// %s : (String) 문자열을 표현하는 기호
		// %c : (Charactor) 문자를 표현하는 기호
		
		// \t : tab(8칸) 만큼 빈칸을 만들어라
		// \n : Enter를 누른것처럼 줄바꿈을 하여라
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%d\t%d\n",
				"총점",
				intKorSum,
				intEngSum,
				intMathSum,
				intMusicSum,
				intArtSum,
				totalSum,
				totalAvg
			);
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%d\t%d\n",
				"평균",
				intKorSum / stdCount,
				intEngSum / stdCount,
				intMathSum / stdCount,
				intMusicSum / stdCount,
				intArtSum / stdCount,
				totalSum / stdCount,
				totalAvg / stdCount
			);
		System.out.println("==============================================================");	
		
		
	}
	
}

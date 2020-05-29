package com.biz.grade;

import java.util.Random;

import com.biz.classes.Score;

public class Grade_04 {

	public static void main(String[] args) {
		
		// Score클래스를 사용해서
		// scores라는 인스턴스 배열을 3개 선언
		// 클래스로 만드는 인스턴스 배열은 생성이 아닌 선언만 가능하다
		Score[] scores = new Score[3];
		
		// 인스턴스 배열을 사용(읽기, 쓰기)를 하려면
		// 다시 각 요소별로 생성을 해 주어야 한다.
		scores[0] = new Score();
		scores[1] = new Score();
		scores[2] = new Score();
		
		scores[0].name = "홍길동";
		scores[1].name = "이몽룡";
		scores[2].name = "성춘향";
		
		Random rnd = new Random();
		for(int i = 0 ; i < 3 ; i++) {
			scores[i].intKor = rnd.nextInt(50) + 51;
			scores[i].intEng = rnd.nextInt(50) + 51;
			scores[i].intMath = rnd.nextInt(50) + 51;
			scores[i].intMusic = rnd.nextInt(50) + 51;
			scores[i].intArt = rnd.nextInt(50) + 51;
		}
		
		for(int i = 0 ; i < 3 ; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%d\t%d\n",
					scores[i].name,
					scores[i].intKor,
					scores[i].intEng,
					scores[i].intMath,
					scores[i].intMusic,
					scores[i].intArt,
					scores[i].sum(),
					scores[i].avg()
			);
		}
		
	}
	
}

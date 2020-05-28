package com.biz.grade;

import java.util.Random;

import com.biz.score.Score;
import com.biz.score.Student;

public class Grade_04 {

	public static void main(String[] args) {

		/*
		 * 임의 정수를 생성하기 위해
		 * Random 이라는 클래스를 사용하기 위한 준비
		 */
		Random random = new Random();
		random.nextInt();
		
		/*
		 * 현재 프로젝트에서 Score라는 클래스를 만들고
		 * 
		 * score라는 인스턴스를 생성하는 코드
		 * Score 라는 클래스를 사용할 준비
		 */
		Score score = new Score();
		score.make();
		score.make();
		score.make();
		
		
		
		Student student = new Student();
		student.make();
		
		
	}
	
}




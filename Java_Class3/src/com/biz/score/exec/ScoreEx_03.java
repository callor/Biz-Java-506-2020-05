package com.biz.score.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.score.vo.ScoreVO;

public class ScoreEx_03 {
	
	public static void main(String[] args) {
		
		int[] num = new int[3];
		
		// 선언을 할때는 List를 사용해서 선언을 하고
		// 초기화를 할때는 new ArrayList() 사용해서 생성을 한다.
		// str1과 int1은 개수가 정해지지 않은
		// 특별한 배열과 같은 존재가 된다.
		// List type의 인스턴스, 
		// List type의 객체, 
		
		// str1 리스트 라고 칭한다
		// String형 데이터 들을 포함할 리스트
		// size가 0인 String형 데이터들을 포함할 리스트를 생성하는 명령문
		List<String> str1 = new ArrayList<String>();
		
		// add() method를 호출해서 데이터를 매개변수로 전달하면
		// 그때마다 size가 1씩 증가하는 리스트로 변경된다.
		str1.add("대한민국");
		str1.add("우리나라");
		str1.add("Republic Of Korea");
		str1.add("" + 90);
				
		// int1 리스트
		// Integer형 데이터 들을 포함할 리스트
		List<Integer> int1 = new ArrayList<Integer>();
		int1.add(90);
		int1.add(100);
		int1.add(200);
		
		// char1 리스트
		// Character형 데이터들을 포함할 리스트
		// Generic : <> 들어가는 키워드 문법형식
		// 		리스트의 type을 결정짓는 문법형식
		List<Character> char1 = new ArrayList<Character>();
		char1.add('A');
		char1.add('가');
		char1.add('1');
		
		// b1 리스트
		// Boolean형 데이터들을 포함할 리스트
		List<Boolean> b1 = new ArrayList<Boolean>();
		
		// f1 리스트
		// Float형 데이터들을 포함할 리스트
		List<Float> f1 = new ArrayList<Float>();
		
		// Double형 데이터들을 포함할 리스트
		List<Double> d1 = new ArrayList<Double>();
		
		// Long형 데이터들을 포함할 리스트
		List<Long> l1 = new ArrayList<Long>();
		
		// java 1.8 이상에서는
		// 초기화 코드(new ArrayList)에는 Generic을 생략할 수 있다.
		List<ScoreVO> score18 = new ArrayList<>();

		// 개발자가 작성한 ScoreVO 클래스 type의 인스턴스를
		// 포함할 수 있는 리스트
		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		
		// jdk에서 제공되는 Random 클래스 type의 인스턴스를
		// 포함할 수 있는 리스트
		List<Random> rndList = new ArrayList<Random>();
		
		
	}
}

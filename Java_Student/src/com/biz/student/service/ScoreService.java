package com.biz.student.service;

/*
 * inputStudent() : student.txt 파일을 읽어서 studentList 를 작성
 * inputScore() : score.txt 파일을 읽어서 scoreList 를 작성
 * 
 * calcSum(), calcAvg() : 총점과 평균 계산
 * 
 * scoreList() : 학생별 과목, 총점, 평균 리스트 출력
 * 
 */
public interface ScoreService {

	public void inputStudent();
	public void inputScore();
	
	public void calcSum();
	public void calcAvg();
	
	/*
	 * =================================================
	 * 성적일람표
	 * =================================================
	 * 학번   이름   국어   영어   수학   총점   평균
	 * -------------------------------------------------
	 */
	public void scoreList();

}

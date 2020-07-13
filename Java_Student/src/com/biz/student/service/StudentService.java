package com.biz.student.service;

import java.util.List;

import com.biz.student.domain.StudentVO;

/*
 * Service
 * Business Login
 * 실제 어떤 일들을 수행하는 주요 method를 모아두는 package
 * 프로젝트에서 주요 연산을 수행하는 코드를 구현할때
 * Service 클래스에 구현을 한다.
 * 
 * Service 클래스는 특별한 경우가 아니면 먼저 interface를 만들어서
 * 어떤 method 를 만들것인가 디자인 하는 것이 좋다.
 * 
 */
public interface StudentService {

	/*
	 * 학생정보를 키보드로 입력하는 method
	 * 1. 학생 1명의 정보를 키보드로 입력받고
	 * 2. 학생List에 추가하는 코드가 작성
	 * 3. 학생 정보를 입력받는 과정에서
	 * 		입력을 중단하고 중단되었다는 것을
	 * 		호출한곳에 통보(return)하는 기능을 구현
	 */
	public boolean inputStudent();
	public void studentList();
	
	public List<StudentVO> getStudentList();
		
}





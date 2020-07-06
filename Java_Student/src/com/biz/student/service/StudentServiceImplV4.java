package com.biz.student.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.biz.student.domain.StudentVO;

public class StudentServiceImplV4 extends StudentServiceImplV2 {

	public StudentServiceImplV4() {
		outPut = System.out;
	}
	
	/*
	 * V2는 V1을 상속받아서 studentList() method를 재정의(Override)해 놓은 상태이다
	 * V3에서는 V2를 상속받아서 V2에 구현된 studentList() method는 그대로 사용하고
	 * V1에 있는 inputStudent() method만 재정의하여  V3를 만들겠다 라는 의미
	 * 
	 * V3에서는 student.txt 파일을 읽어서
	 * 학생정보를 가져오고 studentList() method사용하여 출력해보기
	 * 
	 */
	@Override
	public boolean inputStudent() {

		String studentFile = "src/com/biz/student/exec/student.txt";
		
		// FileReader 클래스로 fileReader 객체(인스턴스)를 선언하고 clear 하기
		// 문자열, 숫자 등이 아닌 정체를 알수 없는 클래스로 객체를 선언할때는
		// 가급적 null로 clear를 시켜주는 것이 좋다.
		FileReader fileReader = null;
		
		// 로컬디스크에 저장된 파일을 읽을때 FileReader 만으로 읽을 수 있지만
		// 파일을 읽어들이는 성능상의 잇점을 주기 위해서 중간 BufferedReader를 
		// 연결하여 파일을 읽어 들이는 것이 좋다.		
		BufferedReader buffer = null;
		
		
		try {
			// 읽어들일 파일을 열고, 파일에 관련된 정보를 fileReader 객체에 저장
			fileReader = new FileReader(studentFile);
			buffer = new BufferedReader(fileReader);
			
			String reader = "" ;
			while(true) {
				reader = buffer.readLine();
				if(reader == null) {
					break;
				}
				// System.out.println(reader);

				// 읽어들인 라인을 분해하여 학생정보로 변환
				String[] students = reader.split(":");
				StudentVO sVO = new StudentVO();
				sVO.setNum(students[0]);
				sVO.setName(students[1]);
				sVO.setGrade(Integer.valueOf(students[2]));
				sVO.setDept(students[4]);
				studentList.add(sVO);
			
			}
		
			// 파일을 읽기, 쓰기로 열었으면 모두 닫아서 종료해주어야 한다.
			buffer.close();
			fileReader.close();
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return true;
	}

	
	
	
}

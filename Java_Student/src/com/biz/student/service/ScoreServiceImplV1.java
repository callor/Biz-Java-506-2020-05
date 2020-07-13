package com.biz.student.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.student.config.SplitPos;
import com.biz.student.domain.ScoreVO;
import com.biz.student.domain.StudentVO;

public class ScoreServiceImplV1 implements ScoreService {

	private List<ScoreVO> scoreList;
	private List<StudentVO> studentList;
	private FileReader fileReader;
	private BufferedReader buffer;

	public ScoreServiceImplV1() {
		scoreList = new ArrayList<ScoreVO>();
		// studentList = new ArrayList<StudentVO>();
		StudentService stService = new StudentServiceImplV5();
		studentList = stService.getStudentList();
	}

	@Override
	public void inputStudent() {
		/*
		String studentFile = "src/com/biz/student/exec/student.txt";
		try {

			fileReader = new FileReader(studentFile);
			buffer = new BufferedReader(fileReader);
			String reader = "";
			while (true) {
				reader = buffer.readLine(); // buffer로 부터 파일에서 한줄씩 읽기
				if (reader == null) { // 파일 끝에 도달했으면!!
					break; // 파일 읽기를 그만 멈추어라
				}

				String[] students = reader.split(":");
				StudentVO sVO = new StudentVO();
				sVO.setNum(students[ SplitPos.STUDENT.ST_NUM  ]);
				sVO.setName(students[ SplitPos.STUDENT.ST_NAME ]);
				sVO.setGrade(Integer.valueOf(students[ SplitPos.STUDENT.ST_GRADE ]));
				sVO.setDept(students[ SplitPos.STUDENT.ST_DEPT ]);
				studentList.add(sVO);
			}
			buffer.close();
			fileReader.close();
		} catch (FileNotFoundException e) {
			System.out.println(studentFile + "파일을 읽기위해 open 하는 중 오류 발생");
			return;
		} catch (NumberFormatException e) {
			System.out.println("점수를 숫자로 바꾸는 과정에서 오류 발생");
		} catch (IOException e) {
			System.out.println("버퍼로 부터 데이터를 읽는데 문제가 발생!!");
		} // try : 파일 읽기 end
		*/
	}

	@Override
	public void inputScore() {

		String scoreFile = "src/com/biz/student/exec/score.txt";
		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {

			fileReader = new FileReader(scoreFile);
			buffer = new BufferedReader(fileReader);
			String reader = "";
			while (true) {
				reader = buffer.readLine(); // buffer로 부터 파일에서 한줄씩 읽기
				if (reader == null) { // 파일 끝에 도달했으면!!
					break; // 파일 읽기를 그만 멈추어라
				}

				String[] scores = reader.split(":");
				ScoreVO sVO = new ScoreVO();
				sVO.setNum(scores[ SplitPos.SCORE.SC_NUM ]);
				sVO.setKor(Integer.valueOf(scores[ SplitPos.SCORE.SC_KOR ]));
				sVO.setEng(Integer.valueOf(scores[ SplitPos.SCORE.SC_ENG ]));
				sVO.setMath(Integer.valueOf(scores[ SplitPos.SCORE.SC_MATH ]));
				scoreList.add(sVO);
				
			}
			buffer.close();
			fileReader.close();
		} catch (FileNotFoundException e) {
			System.out.println(scoreFile + "파일을 읽기위해 open 하는 중 오류 발생");
			return;
		} catch (NumberFormatException e) {
			System.out.println("점수를 숫자로 바꾸는 과정에서 오류 발생");
		} catch (IOException e) {
			System.out.println("버퍼로 부터 데이터를 읽는데 문제가 발생!!");

		} // try : 파일 읽기 end

	}

	@Override
	public void calcSum() {

		for(ScoreVO sVO : scoreList) {
			int sum = sVO.getKor();
			sum += sVO.getEng();
			sum += sVO.getMath();
			sVO.setSum(sum);
		}
	}

	@Override
	public void calcAvg() {
		for(ScoreVO sVO : scoreList) {
			float sum = (float)sVO.getSum();
			float avg = sum / 3;
			sVO.setAvg(avg);
		}
	}

	@Override
	public void scoreList() {

		System.out.println("=====================================================");
		System.out.println("성적일람표");
		System.out.println("=====================================================");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-----------------------------------------------------");

		// data의 Join
		// scoreList, studentList Join해서 데이터를 출력하는 코드
		for(ScoreVO sVO : scoreList) {
			
			System.out.print(sVO.getNum() + "\t");
			
			// 이름
			// score의 학번으로 studentList에서 찾기
			boolean stdCheck = false;
			for(StudentVO stVO : studentList) {
				// 학번이 같은 학생의 정보를 찾았으면
				if(sVO.getNum().equals(stVO.getNum())) {
					System.out.print(stVO.getName() + "\t");
					stdCheck = true;
					break;
				}
			}
			// stdCheck == true : 학생을 찾았음, false : 학생없음
			if(!stdCheck) {
				System.out.print("[없음]" + "\t");
			}
			
			System.out.print(sVO.getKor() + "\t");
			System.out.print(sVO.getEng() + "\t");
			System.out.print(sVO.getMath() + "\t");
			System.out.print(sVO.getSum() + "\t");
			System.out.printf("%5.2f\n",sVO.getAvg());
			
		}
	}

}

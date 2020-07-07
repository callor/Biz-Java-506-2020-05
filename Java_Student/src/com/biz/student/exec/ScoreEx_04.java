package com.biz.student.exec;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.student.domain.ScoreVO;

public class ScoreEx_04 {

	public static void main(String[] args) {
		
		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		String scoreFile = "src/com/biz/student/exec/score.txt";
		
		// File과 관련된 클래스는 객체로 선언하는 코드와
		// 객체를 초기화(생성)하는 코드를 분리한다.
		// 선언할때는 null 값을 clear만 수행하고 다음으로 진행한다.
		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			
			// 파일을 읽기위해서 open 하는 것
			fileReader = new FileReader(scoreFile);
			
			// open된 파일에 대한 정보가 담긴 fileReader 객체를
			// buffer에 연결하여 파일을 읽도록 지시한다.
			buffer = new BufferedReader(fileReader);
			
			// 파일을 읽기 전에 파일 한줄의 문자열을 읽어 담을
			// 문자열 변수를 선언한다.
			// 파일을 읽어서 처리할 문자열은
			// 반복문 밖에서 선언하고 초기화 한후 사용한다.
			String reader = "";
			while(true) {
				reader = buffer.readLine(); // buffer로 부터 파일에서 한줄씩 읽기
				if(reader == null) { // 파일 끝에 도달했으면!!
					break ; // 파일 읽기를 그만 멈추어라
				}
				
				String[] scores = reader.split(":");
				ScoreVO sVO = new ScoreVO();
				sVO.setNum(scores[0]);
				sVO.setKor(  Integer.valueOf(  scores[1]  )  );
				sVO.setEng(  Integer.valueOf(  scores[2]  )  );
				sVO.setMath(  Integer.valueOf(  scores[3]  ) );
				
				scoreList.add(sVO);
			}
			buffer.close();
			fileReader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(scoreFile + "파일을 읽기위해 open 하는 중 오류 발생");
			return;
		} catch (NumberFormatException e) {
			System.out.println("점수를 숫자로 바꾸는 과정에서 오류 발생");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("버퍼로 부터 데이터를 읽는데 문제가 발생!!");
			
		} // try : 파일 읽기 end
		
		// scoreList에는 score.txt 파일에서 읽은 성적리스트가 들어 있다.
		
		
		// scoreList 에 학번 00010인 
		// 학생의 성적 사항을 찾아서 console 출력
		int size = scoreList.size();
		for(int i = 0 ; i < size ; i ++) {
			ScoreVO sVO = scoreList.get(i);
			if(sVO.getNum().equals("00010")) {
				System.out.println("학번:" + sVO.getNum());
				System.out.println("국어:" + sVO.getKor());
				System.out.println("영어:" + sVO.getEng());
				System.out.println("수학:" + sVO.getMath());
				break;
			}
		}
		
		for(ScoreVO sVO : scoreList) {
			if(sVO.getNum().equals("00010")) {
				System.out.println("학번:" + sVO.getNum());
				System.out.println("국어:" + sVO.getKor());
				System.out.println("영어:" + sVO.getEng());
				System.out.println("수학:" + sVO.getMath());
				break;
			}
		}
		
		
		
		
		
		
		
		
	}
}

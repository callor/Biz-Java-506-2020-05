package com.biz.student.service;

import java.io.FileNotFoundException;
import java.io.PrintStream;

import com.biz.student.domain.StudentVO;

// StudentServiceImplV1에 정의된
// 필드변수, method를 상속받아서 작성하는 클래스
// 필드변수와 method는 public, protected로 되어있는 경우만 상속된다.
public class StudentServiceImplV2 extends StudentServiceImplV1{

	protected PrintStream outPut;
	
	public StudentServiceImplV2() {
		String studentFile = "src/com/biz/student/exec/student_list.txt";
		// exception Handling
		// 파일을 작성하는 과정에서
		// 아무리 코드를 잘 작성해도 운영체제 차원에서 발생하는 exception은
		// 코드에서 처리가 어렵다는 것을 컴파일러가 알고 있기 때문에
		// 개발자에게 의무적으로 exception처리를 하도록 규정하고 있다.
		try {
			outPut = new PrintStream(studentFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(studentFile + " 파일을 만들수 없음!!");
			return;
		}
	}
	
	
	// V1에 선언된 studentList는 protected로 되어있기 때문에
	// 그대로 접근이 가능하고
	// V1의 생성자에서 생성(초기화)가 되어 있기 때문에
	// V2에서는 그냥 접근하여 읽기, 쓰기를 수행하면 된다.
	
	// V1에서 구현된 studentList() method를 다시 새롭게 구현하겠다
	// List를 Console에 보여주는 방식이었는데
	// List결과를 file에 저장하여 프로젝트가 종료되어도 언제든지
	// 결과를 확인할 수 있도록 구현해보자
	// 데이터, 결과를 파일로 저장하는 것은 결과를 영구 보관하는 목적이 있다.
	// 이러한 것을 project에서 persistence 관리 라고 한다.
	@Override
	public void studentList() {
		// System.out.println("콘솔에 데이터 출력하기");
		outPut.println("=======================================");
		outPut.println("학생 일람표");
		outPut.println("=======================================");
		outPut.println("학번\t이름\t학년\t학과");
		outPut.println("---------------------------------------");
		for(StudentVO sVO : studentList) {
			outPut.print(sVO.getNum() + "\t");
			outPut.print(sVO.getName() + "\t");
			outPut.print(sVO.getGrade() + "\t");
			outPut.println(sVO.getDept());
		}
		outPut.println("=======================================");
		outPut.close();
	}
	
}

package com.biz.student.exec;

import com.biz.student.service.StudentService;
import com.biz.student.service.StudentServiceImplV4;

public class StudentEx_03 {

	public static void main(String[] args) {
		
		StudentService sService = new StudentServiceImplV4();
		sService.inputStudent();
		sService.studentList();
		
		
		
		
		
		
	}
	
}

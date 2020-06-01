package com.biz.classes;

import com.biz.classes.service.LineService;

public class ClassEx_008 {

	public static void main(String[] args) {
		
		LineService line = new LineService();
		
		System.out.println( line.do_line(50) );
		System.out.println("성적일람표");
		System.out.println( line.single(50) );
		System.out.println(90);
		System.out.println(90);
		System.out.println(90);
		System.out.println( line.single(50) );
		System.out.println(270);
		System.out.println( line.do_line(50) );
		
	}
	
}

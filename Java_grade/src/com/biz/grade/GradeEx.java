package com.biz.grade;

import com.biz.classes.ScoreService;

public class GradeEx {
	
	public static void main(String[] args) {
		
		ScoreService sService = new ScoreService();
		
		String ret = sService.input();
		int sum = sService.sum();
		int avg = sService.avg();
		
	}

}

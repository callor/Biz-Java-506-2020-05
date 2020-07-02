package com.biz.score;

import com.biz.score.service.ScoreService02;

public class ScoreMain02 {

	public static void main(String[] args) {
		
		ScoreService02 scoreService = new ScoreService02();
		
		while(true) {
			if(!scoreService.inputScore()) {
				break;
			}
		}
		System.out.println("입력완료");
		scoreService.scoreList();
	}
	
}

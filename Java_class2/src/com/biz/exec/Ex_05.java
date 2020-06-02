package com.biz.exec;

import java.util.Random;

import com.biz.model.ScoreVO;
import com.biz.service.ScoreServiceV2;

public class Ex_05 {

	public static void main(String[] args) {
		
		ScoreVO[] score = new ScoreVO[20];
		for(int i = 0; i < score.length; i++) {
			score[i] = new ScoreVO();
		}
		Random rnd = new Random();
		for(int i = 0 ; i < score.length ; i++) {
			score[i].setName("" + i);
			score[i].setKor(rnd.nextInt(50) +51);
			score[i].setEng(rnd.nextInt(50) +51);
			score[i].setMath(rnd.nextInt(50) +51);
		}
		
		ScoreServiceV2 scoreService = new ScoreServiceV2();
		scoreService.setScoreList(score);
		scoreService.scoreSum();
		scoreService.scoreList();
		
		
		
		
	}
	
}

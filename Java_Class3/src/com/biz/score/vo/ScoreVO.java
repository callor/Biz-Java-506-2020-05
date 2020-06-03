package com.biz.score.vo;

public class ScoreVO {
	
	private String num;
	private int kor;
	private int eng;
	private int math;
	private int music;
	
	private int stSum;
	private int stAvg;
	
	
	public int getStSum() {
		return stSum;
	}
	public void setStSum(int stSum) {
		this.stSum = stSum;
	}
	public int getStAvg() {
		return stAvg;
	}
	public void setStAvg(int stAvg) {
		this.stAvg = stAvg;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getMusic() {
		return music;
	}
	public void setMusic(int music) {
		this.music = music;
	}
	

}

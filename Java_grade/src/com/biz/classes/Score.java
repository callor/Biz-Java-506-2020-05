package com.biz.classes;

public class Score {

	public String name;
	
	public int intKor;
	public int intEng;
	public int intMath;
	public int intMusic;
	public int intArt;
	
	public int intSum;
	public int intAvg;

	public int sum() {
		
		intSum = intKor;
		intSum += intEng;
		intSum += intMath;
		intSum += intMusic;
		intSum += intArt;
		
		return intSum;
		
	}
	
	public int avg() {
		
		intAvg = intSum / 5;
		
		return intAvg;
		
	}
	
}




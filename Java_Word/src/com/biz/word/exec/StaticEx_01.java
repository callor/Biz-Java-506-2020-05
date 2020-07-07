package com.biz.word.exec;

import com.biz.word.domain.WordVO;
import com.biz.word.statics.SplitPosition;

public class StaticEx_01 {

	public static void main(String[] args) {
		
		// static method는 별도로 객체(인스턴스)를 생성하지 않고
		// 클래스. 연산자를 사용하여 직접 접근이 가능하다.
		SplitPosition.out("대한민국");
		
		WordVO w1 = new WordVO();
		WordVO w2 = new WordVO();
		WordVO w3 = new WordVO();
		WordVO w4 = new WordVO();
		WordVO w5 = new WordVO();
		WordVO w6 = new WordVO();
		WordVO w7 = new WordVO();
		
		
	}
	
}

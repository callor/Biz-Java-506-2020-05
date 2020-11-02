package com.biz.test;

public class BookEx {

	public static void main(String[] args) {
		
		// BookVO 클래스를 사용하여 book 객체를 선언하고
		// 초기화(생성)를 수행하는 상태
		BookVO book = new BookVO();
		
		// BookVO 클래스를 books 배열로 선언만 한 상태
		// 클래스, 변수를 선언만한 상태에서는 사용이 불가능 하다.
		// 특히 클래스는 선언만 하고 초기화를 하지 않으면
		// 읽기, 쓰기가 모두 금지된다.
		// 변수는 선언만한 상태에서는 읽기는 금지, 쓰기는 가능한 상태
		BookVO[] bookVO = new BookVO[10];
		int index = 2;
		
		// 2번(index가 2번) 배열의 객체를 초기화 하기
		bookVO[index] = new BookVO();
		
		// 배열 10개의 객체를 모두 초기화 하기
		for(int i = 0 ; i < bookVO.length; i++) {
			bookVO[i] = new BookVO();
		}
		
		// bookVO[2].setTitle("자바의 정석")
		bookVO[index].setTitle("자바의 정석");
		bookVO[index].setComp("도우출판사");

		System.out.println("도서명:" + bookVO[index].getTitle());
		System.out.println("출판사:" + bookVO[index].getComp());
		
		/*
		 * 객체를 초기화 하지 않은 상태
		 */
		BookVO b1;
		BookVO b2 = null;
		
		/*
		 * 초기화를 하지 않은 객체를 사용하려면
		 * 반드시 먼저 생성자를 사용하여 객체를 생성해 주어야 한다.
		 * 
		 * 초기화가 된 객체를 인스턴스라고 한다.
		 * 객체, object, 객체변수, 인스턴스
		 * 
		 */
		b1 = new BookVO();
		b2 = new BookVO();
		
		
		
		
		
		
	}
	
}

package com.biz.word.statics;

/*
 * 클래스에 정의된 필드변수, method에
 * static 키워드가 부착이 되면
 * 이 클래스를 static 클래스 라고 한다.
 * 
 * static 클래스는 초기화 과정이 수행 할 필요 없이 사용할수 있다.
 * SplitPosition sPos = new SplitPosition(); 와 같은 코드를 사용할 필요가 없다
 * 
 * 
 * static 클래스는 프로젝트가 run(시작)되는 순간
 * 자동으로 객체를 1번 생성하여 method 기억영역에 보관해 둔다.
 * 1번만 생성되기 때문에 메모리 공간을 1번만 차지하는 효과를 내고
 * 프로젝트의 어떠한 클래스, method에서든지 직접 접근하여 사용할수 있다.
 * 
 */
public class SplitPosition {

	// static으로 선언된 변수는
	// 누구나 어디에서든지 접근하여 읽기, 쓰기 가능하다
	// 만약 WORD_ENG 변수를 어딘가에서 0이아닌 다른 값으로 변경을 해버리면
	// WORD_ENG변수를 진짜 사용해야할 곳에서 문제가 발생할수 있다.
	// 그래서 이러한 변수에는 final 키워드를 붙여준다.
	// final 키워드가 부착된 변수는 다른곳에서 읽기만 가능하고 
	// 절대 값을 변경할수 없게 된다.
	public static final int WORD_ENG = 0;
	public static final int WORD_KOR = 1;
	
	public static void out(String str) {
		System.out.println(str);
	}
	
}

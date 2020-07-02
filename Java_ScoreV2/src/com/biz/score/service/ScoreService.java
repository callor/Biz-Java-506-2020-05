package com.biz.score.service;

/*
 * ScoreService 클래스를 디자인하기
 * 		boolean inputScore()
 * 		void calcSum()
 * 		void calcAvg()
 * 		void scoreList()
 * 
 * 인터페이스
 * 		자바 클래스의 한 형태이다
 * 		메서드들의 원형(Prototype)을 정의만 할수 있다.
 * 		메서드들이 할일(코드)는 구체적으로 작성할수 없다.
 * 		모든 메서드는 {} 없이 메서드에서 바로 문장이 종료된다.
 * 		인터페이스를 implements할 클래스에 규칙을 지정한다.
 * 		인터페이스를 implements한 클래스는 
 * 			인터페이스에 정의된 메서드를 모두 구현해야 한다.
 * 			인터페이스에 정의된 모든 메서드를 의무적으로 포함해야 한다.
 * 			인터페이스에 정의된 메서드 이름을 변경하여 사용할수 없다.
 * 			자신이 어떤 메서드를 구체적으로 만들어야하는지 명확히 알수 있다.
 * 
 * 		인터페이스를 implements한 클래스를 사용하는 곳에서는
 * 			지금 호출하는 method는 어떤 클래스를 사용하든 같은 이름일 것이다. 라는 기대
 * 			지금 호출하는 method가 반드시 존재하는 메서드 이다 라는 기대
 * 			혹시 다른 클래스를 사용해서 객체(인스턴스)를 생성했을때
 * 				나머지 부분의 코드를 (거의) 변경없이 테스트, 사용이 가능하다는 기대
 * 
 * 		인터페이스를 사용하므로 해서 (Service)클래스와 (Main)클래스간에
 * 			결합도는 낮아지고 응집도는 높아져서 개발생산성, 유지보수성, 등이 매우 좋아진다
 * 
 * 		인터페이스를 잘 디자인 해 두면, 어플리케이션을 만들어가는 과정중에
 * 			후반부로 갈수록 시간, 비용 등이 절약된다.
 * 
 * 
 */
public interface ScoreService {
	public boolean inputScore(); // method() { .... }
	public void calcSum();
	public void calcAvg();
	public void scoreList();
}

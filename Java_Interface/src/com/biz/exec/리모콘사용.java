package com.biz.exec;

import com.biz.interfaces.RemoConInterface;
import com.biz.service.가회사;
import com.biz.service.나회사;

public class 리모콘사용 {
	
	public static void main(String[] args) {
		
		// 인터페이스를 사용한 객체지향의 다형성 특징
		
		// 인터페이스를 상속받은 클래들은
		// 인터페이스로 선언을 하고 실제 클래스로 생성을 하는 구조의 코드가 된다.
		RemoConInterface 가 = new 가회사();
		RemoConInterface 나 = new 나회사();
		
		가.전원ON(); // 가회사 리모콘의 전원ON 기능
		
		가 = new 나회사(); // "가"라는 객체를 나회사의 클래스로 교체
		가.전원ON(); // 나회사 리모콘의 전원ON 기능을 사용가능
		
		// 사용자는 아무런 혼란없이 나머지 코드가 변경되지 않고도 그대로
		// 사용이 가능한 구조
		
	}

}

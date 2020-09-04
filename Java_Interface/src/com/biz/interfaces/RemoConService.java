package com.biz.interfaces;


/*
 * S 회사에서 이번에 대형 TV 개발해서 판매시작하려고 한다.
 * 대형 TV 필요한 리모콘을 외주업체에게 발주를 해서 제작하려 한다.
 * 담당자가 외주업체한테
 * - 우리가 필요한 리모큰의 기능 1,2,3 이런 기능이 있다 라고 주문을 한다.
 * - 서류를 이용해서 주문을 할텐데
 * - S 회사하고 리모콘을 만드는 회사간에 의사소통이 잘되면 좋은데 그렇지 못할 수가 있다.
 * - S 회사에서 가, 나, 다 회사한테 리모콘을 주문했다
 */
public class RemoConService {

}

class 가회사리모콘 {
	
	public void 전원() {
		System.out.println("전원켜기");
		// 전원끄기가 없고
	}
	
	public void 볼륨() {
		System.out.println("볼륨올리기");
		// 볼륨낮추기가 없는
	}
	
	public void 채널() {
		System.out.println("채널변경");
	}
	
}

class 나회사리모콘 {
	
	public void 전원켜기() {
		
	}
	public void 전원끄기() {
		
	}
	public void 볼륨() {
		System.out.println("볼륨낮추기만");
	}
	
}
package com.biz.addr.exec;

import com.biz.addr.service.AddrService03;

public class AddrEx_04 {

	public static void main(String[] args) {
		
		AddrService03 addrService = new AddrService03();
		
		// for( ;; ) 과 같은 코드
		// 숫자 1은 당연히 1이므로 1 == 1은 결과값이 영원히 true이다.
		// 따라서 while(true) 와 같은 코드가 된다.
		while( 1==1 ) {
			
			/*
			 * addrService객체의 inputAddr() method를 호출하고
			 * 그 결과를 메모리 어딘가에 보관하라
			 * 메모리에 보관된 값이 false(!) 이면 break를 실행하라
			 */
			if( !addrService.inputAddr() ) {
				break;
			}
		
		}
		
		addrService.addList();
		System.out.println("업무 종료");
	
	}
}

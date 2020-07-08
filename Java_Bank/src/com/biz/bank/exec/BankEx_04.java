package com.biz.bank.exec;

import java.util.Scanner;

import com.biz.bank.service.BankService;
import com.biz.bank.service.BankServiceImplV3;
import com.biz.bank.service.BankServiceImplV4;

public class BankEx_04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		BankService bService = new BankServiceImplV4();
		
		while(true) {
			
			System.out.println("==================================");
			System.out.println("빛고을 뱅크 계정계 시스템 V3");
			System.out.println("==================================");
			System.out.println("1. 입금처리");
			System.out.println("2. 출금처리");
			System.out.println("3. 입출금 내역 출력");
			System.out.println("-1. 업무종료");
			System.out.println("==================================");
			System.out.print("업무선택 >> ");
			
			String strMenu = scan.nextLine();
			int intMenu = 0;
			try {
				intMenu = Integer.valueOf(strMenu);
			} catch (Exception e) {
				System.out.println("메뉴선택은 숫자로만 입력하세요");
				continue;
			}
 			if(intMenu == -1) {
 				break;
 			} else if (intMenu < 1 || intMenu > 3) {
 				System.out.println("선택된 업무가 없습니다");
 				continue;
 			}

 			/*
 			 * interface를 설계할 당시 필요하지 않아 정의하지 않은 method는
 			 * 보통 구현된 class 내에서만 사용하는 것으로 
 			 * 			private, protected로 선언을 한다
 			 * 그러나, 프로젝트가 진행되는 동안
 			 * 		구현된 class에 어떤 메서드를 추가하고
 			 * 		이 method를 외부에서 호출하여 어떤 행동을 수행해야할 
 			 * 		필요가 있을때가 있다.
 			 * 
 			 * 객체를 선언할때 interface로 선언을 하면
 			 * 		클래스에 구현된 method를 직접 호출하는 것이 안된다.
 			 * 		이럴때 down Casting을 해서 해당 method를 사용할수 있다.
 			 */
 			// interface에 설정되지 않은 V4에만 있는 메서드를 호출하는 방법
 			// down Casting
 			boolean bRet = ((BankServiceImplV4)bService).account();
 			if( !bRet ) {
 				continue;
 			}
 			if(intMenu == 1) {
 				// 입금업무처리
 				bService.inputBalance();
 			} else if(intMenu == 2) {
 				//  출금업무처리
 				bService.outputBalance();
 			} else if(intMenu == 3) {
 				// 입출금내역서 출력
 				bService.listBalance();
 			}
		}
	}
	
}

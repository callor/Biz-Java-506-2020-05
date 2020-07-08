package com.biz.bank.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.biz.bank.domain.AccountVO;

public class BankServiceImplV2 implements BankService {
	
	private List<AccountVO> accList;
	private Scanner scan ;
	
	public BankServiceImplV2() {
		accList = new ArrayList<AccountVO>();
		scan = new Scanner(System.in);
	}
	
	@Override
	public boolean inputBalance() {

		System.out.print("입금액 >> ");
		String strInput = scan.nextLine();
		
		int intInput = 0 ;
		try {
			intInput = Integer.valueOf(strInput);
		} catch (Exception e) {
			System.out.println("입금액은 숫자만 가능하다");
			return true;
		}

		// java.util.Date 를 사용해 한다.
		// 현재 (OS)시스템의 날짜를 가져와서 객체로 생성 
		// Date type 형의 객체 생성
		Date date = new Date();
		
		// Date 형 객체 String형 객체 변환
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // 20202-07-08
		SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss"); // 11:39:00
		
		String curDate = dateFormat.format(date); // date에 담긴 현재 날짜를 문자열로 변환
		String curTime = dateFormat.format(date); // date에 담긴 현재 시각을 문자열로 변환
		
		AccountVO accVO = new AccountVO();

		// 2020-07-08 11:41:00 형식으로 날짜를 세팅하겠다
		accVO.setDate(  String.format("%s %s",curDate,curTime)  );
		accVO.setInput(intInput);
		accList.add(accVO);
		return true;

	}

	@Override
	public boolean outputBalance() {
		return true;
	}

	@Override
	public void listBalance() {

		System.out.println("====================================================");
		System.out.println("001 계좌 입출금 내역서");
		System.out.println("====================================================");
		System.out.println("거래일자\t\t입금액\t출금액\t잔액");
		System.out.println("----------------------------------------------------");
		
		int balance = 1000_000 ;
		for(AccountVO accVO : accList) {
			System.out.print(accVO.getDate() + "\t");
			System.out.print(accVO.getInput() + "\t");
			System.out.print(accVO.getOutput() + "\t");
			
			balance += accVO.getInput();
			balance -= accVO.getOutput();
			System.out.println(balance);
		}
		System.out.println("====================================================");
		System.out.println("출력 완료!! 아무키나 누르세요......");
		scan.nextLine();
	}
}

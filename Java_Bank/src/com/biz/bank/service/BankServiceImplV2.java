package com.biz.bank.service;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.biz.bank.config.Lines;
import com.biz.bank.domain.AccountVO;

public class BankServiceImplV2 implements BankService {

	protected List<AccountVO> accList;
	protected Scanner scan;

	public BankServiceImplV2() {
		accList = new ArrayList<AccountVO>();
		scan = new Scanner(System.in);
	}

	/*
	 * BankService interface에 선언되지 않은 method로
	 * BankServiceImplV2 클래스 내부에서만
	 * 사용하기 위해 구현한 method
	 * 단, BankServiceImplV2 클래스를 상속받게 되면
	 * 		이 method를 사용할 수 있다.
	 * 
	 * protected 접근제한자는 이 클래스를 생성하고 사용하는 곳(main())에서는
	 * 		호출하거나 접근을 할수 없다.
	 * 		다만, 이 클래스를 상속받은 클래스에서는 제한적으로 호출하여 
	 * 		사용할수도 있다.
	 */
	// 입금과 출금을 1개의 method로 구현하기
	protected void keyInput(String inout) {

		/*
		 * 3항연산자 inout.equals("INPUT") 조건이 true이면 입금액 문자열을 title 변수에 저장하고 아니면 출금액 문자열을
		 * title 변수에 저장하라
		 */
		String title = inout.equals("INPUT") ? "입금액" : "출금액";
		// 아래의 if() 명령문과 동일한 기능을 수행한다.
		if (inout.equals("INPUT")) {
			title = "입금액";
		} else {
			title = "출금액";
		}

		System.out.printf("%s >> ", title);
		String strInput = scan.nextLine();

		int intInput = 0;
		try {
			intInput = Integer.valueOf(strInput);
		} catch (Exception e) {
			System.out.println("금액은 숫자만 가능하다");
			return;
		}

		if (inout.equals("OUTPUT")) {
			// 잔액계산
			int balance = 0;
			for (AccountVO accVO : accList) {
				balance += accVO.getInput();
				balance -= accVO.getOutput();
			}
			if (balance < intInput) {
				System.out.println("잔액이 부족하여 출금할 수 없음!!");
				return;
			}
		}

		// java.util.Date 를 사용해 한다.
		// 현재 (OS)시스템의 날짜를 가져와서 객체로 생성
		// Date type 형의 객체 생성
		Date date = new Date();

		// Date 형 객체 String형 객체 변환
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // 20202-07-08
		SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss"); // 11:39:00

		String curDate = dateFormat.format(date); // date에 담긴 현재 날짜를 문자열로 변환
		String curTime = timeFormat.format(date); // date에 담긴 현재 시각을 문자열로 변환

		AccountVO accVO = new AccountVO();

		// 2020-07-08 11:41:00 형식으로 날짜를 세팅하겠다
		accVO.setDate(String.format("%s %s", curDate, curTime));

		if (inout.equals("INPUT")) {
			accVO.setInput(intInput);
		} else {
			accVO.setOutput(intInput);
		}
		accList.add(accVO);
	}

	@Override
	public boolean inputBalance() {
		this.keyInput("INPUT");
		return true;
	}

	@Override
	public boolean outputBalance() {
		keyInput("OUTPUT");
		return true;
	}

	@Override
	public void listBalance() {

		// 숫자를 회계방식 문자열로 표현하기 위한 클래스 도구
		// 100,000,000
		DecimalFormat df = new DecimalFormat("##,###");
		String[] listTitle = {"거래일자","입금액","출금액","잔액"};
		
		System.out.println(Lines.dLine);
		System.out.println("001 계좌 입출금 내역서");
		System.out.println(Lines.dLine);
		
		// %20s : 문자열을 표현하기위해 20개의 칸을 만들고
		// 		문자열을 채운후 나머지는 빈칸으로 남겨두어라
		//		문자열은 20개 칸에서 오른쪽으로 정렬하라
		// %-20s : 위와 같인 왼쪽으로 정렬하라.
		System.out.printf("%-15s\t|%17s\t|%17s\t|%17s\t|\n",
				listTitle[0],
				listTitle[1],
				listTitle[2],
				listTitle[3]);
		
		System.out.println(Lines.sLine);

		int balance = 0;
		String strNumber = "";
		
		for (AccountVO accVO : accList) {
			System.out.printf("%-20s\t|",accVO.getDate());
						
			System.out.printf( "%20s\t|",df.format(accVO.getInput())  );
			System.out.printf( "%20s\t|", df.format(accVO.getOutput())  );

			balance += accVO.getInput();
			balance -= accVO.getOutput();
			
			System.out.printf("%20s\t|\n", df.format(balance));
		}
		System.out.println(Lines.dLine);
		System.out.println("출력 완료!! 아무키나 누르세요......");
		scan.nextLine();
	}
}

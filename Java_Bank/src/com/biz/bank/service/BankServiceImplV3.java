package com.biz.bank.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

import com.biz.bank.config.Posion;
import com.biz.bank.domain.AccountVO;

/*
 * V3 업그레이드
 * 프로젝트가 시작될때 balance.txt 파일을 읽어서
 * 거래내역을 가져오고
 * 입출금 업무를 수행하면 입출금 항목을 계속 추가하고
 * 업무를 종료하면 추가된 
 * 입출금 항목을 다시 balance.txt 파일에 추가하여
 * 다음 프로젝트가 시작될때 그 내용을 유지하도록 하자 
 */
public class BankServiceImplV3 extends BankServiceImplV2 {

	// V2를 상속받아서 bankList() 만 이어받아 사용한다.
	// input(), output() 메서드는 별도로 구현을 하자

	String bFileName = "";
	
	public BankServiceImplV3() {
		bFileName = "src/com/biz/bank/exec/data/balance.txt";
		this.loadBalance();
	}

	protected void loadBalance() {

		// 새로운 계좌번호를 선택했을때 
		// 새로운 balance정보를 가져오기 위해서
		// 기존의 accList를 모두 제거하기
		// 기존 List를 제거하지 않으면 계좌를 선택할때마다
		// 리스트가 추가되어 나타나게된다.
		accList.clear();
		
		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(bFileName);
			buffer = new BufferedReader(fileReader);

			String reader = "";
			while (true) {
				reader = buffer.readLine();
				if (reader == null) {
					break;
				}
				String[] balances = reader.split(",");

				AccountVO accVO = new AccountVO();

				accVO.setDate(balances[Posion.ACC_DATE]);
				accVO.setInput(Integer.valueOf(balances[Posion.ACC_INPUT]));
				accVO.setOutput(Integer.valueOf(balances[Posion.ACC_OUTPUT]));
				accList.add(accVO);
			}
			buffer.close();
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("계좌가 없으므로 새로운 계좌를 개설합니다");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public boolean inputBalance() {
		this.keyInput("INPUT");
		this.saveBalance();
		return true;
	}

	@Override
	public boolean outputBalance() {
		this.keyInput("OUTPUT");
		this.saveBalance();
		return true;
	}
	
	protected void saveBalance() {
		
		PrintStream outPut = null;
		try {
			outPut = new PrintStream(bFileName);
			
			int balance = 0 ;
			for(AccountVO accVO : accList) {
				
				balance += accVO.getInput();
				balance -= accVO.getOutput();
				
				// 거래일자, 입금, 출금 잔액
				outPut.printf("%s,%d,%d,%d\n", 
						accVO.getDate(),
						accVO.getInput(),
						accVO.getOutput(),balance);
			}
			outPut.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	

}

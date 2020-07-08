package com.biz.bank.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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

	public BankServiceImplV3() {
		this.loadBalance();
	}

	private void loadBalance() {
		String bFile = "src/com/biz/bank/exec/data/balance.txt";

		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(bFile);
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
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public boolean inputBalance() {
		return true;
	}

	@Override
	public boolean outputBalance() {
		return true;
	}

}

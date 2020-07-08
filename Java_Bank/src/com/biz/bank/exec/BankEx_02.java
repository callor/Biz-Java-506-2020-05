package com.biz.bank.exec;

import com.biz.bank.service.BankService;
import com.biz.bank.service.BankServiceImplV3;

public class BankEx_02 {

	public static void main(String[] args) {
		
		BankService bService = new BankServiceImplV3();
		bService.listBalance();
		
	}
}

package com.biz.classes;

import com.biz.classes.model.BankVO;

public class ClassEx_11 {
	
	public static void main(String[] args) {
		
		BankVO bank = new BankVO();
		bank.setStrNum("001");
		bank.setStrDate("2020-06-01");
		bank.setIntInput(5000);
		bank.setIntOutput(1000);
		
		BankVO[] bankList = new BankVO[5];
		bankList[0] = new BankVO();
		bankList[1] = new BankVO();
		bankList[2] = new BankVO();
		bankList[3] = new BankVO();
		bankList[4] = new BankVO();
		
		bankList[0].setStrNum("001");
		bankList[1].setStrNum("002");
		bankList[2].setStrNum("003");
		bankList[3].setStrNum("004");
		bankList[4].setStrNum("005");
		
		for(int i = 0 ; i < bankList.length ;i++) {
			bankList[i].setStrDate("2020-06-01");	
		}
		
		bankList[0].setIntInput(5000);
		bankList[2].setIntInput(5000);
		
		bankList[1].setIntOutput(1000);
		bankList[3].setIntOutput(1000);
		bankList[4].setIntOutput(1000);
		
	}
	

}

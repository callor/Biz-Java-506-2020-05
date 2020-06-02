package com.biz.exec;

import com.biz.model.AddressVO;
import com.biz.service.AddrServiceV1;

public class Ex_02 {

	public static void main(String[] args) {
		
		AddressVO[] address = new AddressVO[5];
		
		address[0] = new AddressVO();
		address[1] = new AddressVO();
		address[2] = new AddressVO();
		address[3] = new AddressVO();
		address[4] = new AddressVO();

		for(int i = 0; i< address.length ; i++) {
			address[i] = new AddressVO();
		}
		
		address[0].setName("이몽룡");
		address[1].setName("성춘향");
		address[2].setName("홍길동");
		address[3].setName("임꺽정");
		address[4].setName("임사홍");
		
		address[0].setTel("010-111-0000");
		address[1].setTel("010-222-0000");
		address[2].setTel("010-333-0000");
		address[3].setTel("010-444-0000");
		address[4].setTel("010-555-0000");
		
		address[0].setAddr("서울시");
		address[1].setAddr("광주시");
		address[2].setAddr("부산시");
		address[3].setAddr("울산시");
		address[4].setAddr("대전시");
		
		address[0].setAge(11);
		address[1].setAge(22);
		address[2].setAge(33);
		address[3].setAge(44);
		address[4].setAge(55);
		
		AddrServiceV1 addrService = new AddrServiceV1();
		// 배열을 매개변수를 통해 method에게 전달할때는 이름만 붙여주면된다.
		addrService.addrList(address);

		
	}
	
}

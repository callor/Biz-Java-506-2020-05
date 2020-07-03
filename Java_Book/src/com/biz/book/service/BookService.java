package com.biz.book.service;

public interface BookService {

	/*
	 * input()
	 * 어떤 정보를 키보드에서 입력받기
	 * 무작정 입력받기하고
	 * 입력하는 과정에서 END 문자열을 입력하면
	 * 입력을 중단한다는 신호를 호출한 곳으로 return
	 * 
	 * input() 에서
	 * 모든 항목 입력이 정상적으로 이루어지면 return true
	 * 만약 중단하기 위해 END 문자열을 입력하면
	 * 		호출한곳에 false return 하여 더이상
	 * 		입력을 하지 않겠다고 신호를 보냈다. 
	 * 호출한 곳에 true, false를 return 하기 위해서
	 * input() method의 return type을 
	 * 	void에서 boolean으로 변경하였다.
	 */
	public boolean inputBook();
	public void listBook();
	
}

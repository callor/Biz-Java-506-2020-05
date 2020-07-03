package com.biz.book.domain;

import com.biz.book.service.BookService;
import com.biz.book.service.BookServiceImplV1;

public class BookEx_01 {

	public static void main(String[] args) {
		
		BookService bService = new BookServiceImplV1();
		while(true) {
			
			if(!bService.inputBook()) {
				break;
			}
		}
		bService.listBook();
	}
}

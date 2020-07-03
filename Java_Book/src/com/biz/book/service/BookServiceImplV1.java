package com.biz.book.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.book.domain.BookVO;

/*
 * BookService inteface를 implements하여 작성
 * 구체적인 method의 코드를 작성해야 한다.
 * 
 * interface를 implements하면 interface에 정의된 method를
 * 모두 Override하여 구현해야 하는 규칙이 적용이된다.
 * 
 * implements를 수행한 다음에는 반드시
 * add unimplemented method를 실행하여야 한다. 
 */
public class BookServiceImplV1 implements BookService{

	List<BookVO> bookList;
	public BookServiceImplV1() {
		bookList = new ArrayList<BookVO>();
	}
		
	@Override
	public boolean inputBook() {
		// inputBook() method내에서만 
		// Scanner를 사용하게 될것으로 예상되므로
		// 필드변수에 선언하지 않고 
		// method 의 지역변수로 선언, 초기화를 수행
		// method의 지역변수로 선언을 하면 inputBook() method의 수행이 끝나면
		// 변수가 자동으로 해제되는 효과를 낼수 있다.
		Scanner scan = new Scanner(System.in);
		BookVO bookVO = new BookVO();
		
		System.out.print("도서명(END:입력종료) >> ");
		String strTitle = scan.nextLine();
		// 사용자가 도서명에 END를 입력하면
		// 더이상 입력을 하지 않겠다라는 신호를 
		// 호출한 곳에 return
		if(strTitle.equals("END")) {
			return false;
		}
		bookVO.setTitle(strTitle);
		
		System.out.print("출판사 >> ");
		String strComp = scan.nextLine();
		bookVO.setComp(strComp);
		
		System.out.print("저자 >> ");
		String strWriter = scan.nextLine();
		bookVO.setWriter(strWriter);

		System.out.print("출판연도 >> ");
		String strYear = scan.nextLine();
		// vo에서 출판연도 필드변수를 int로 지정했기 때문에
		// 입력받은 문자열을 숫자로 바꿀 필요가 있다.
		int intYear = 0;
		try {
			intYear = Integer.valueOf(strYear);
		} catch (Exception e) {
			/*
			 * 만약 연도를 문자열로 잘못입력해서 오류가 발생할 경우
			 * 현재 입력하고 있는 
			 * 도서정보를 도서명부터 다시 입력하도록
			 */
			System.out.println("연도는 숫자만 가능");
			System.out.println(bookVO.getTitle() 
					+ "도서정보부터 다시 입력하세요");
			return true;
		}
		bookVO.setYear(intYear);
				
		System.out.print("가격 >> ");
		String strPrice= scan.nextLine();
		int intPrice = 0;
		try {
			intPrice = Integer.valueOf(strPrice);
		} catch (Exception e) {
			System.out.println("가격은 숫자만 가능");
			System.out.println(bookVO.getTitle() 
					+ " 도서 정보부터 다시 입력하세요");
			return true;
		}
		/*
		 * bookList.add(bookVO) 코드가 실행되기전에
		 * return true 를 수행하면
		 * 현재 method가 실행되면서 입력했던 
		 * 도서정보(도서명,출판사 등)들이 아직 List에 추가되기 전이므로
		 * 현재의 입력된 도서정보는 모두 무시되어 버린다
		 * main에서는 true가 return 되었으므로
		 * 아무런 판단없이 다시 입력을 수행하는 inputBook() method를 
		 * 호출하게 될 것이고
		 * 
		 * return하기전에 현재 도서를 다시 입력하라는 메시지를 
		 * 보여주었으므로
		 * 입력하는 사용자는 당연히 현재 입력하던 도서를
		 * 다시 입력하게 될 것이다.
		 */
		bookVO.setPrice(intPrice);
		bookList.add(bookVO);
		
		// 모든 항목이 입력이 완료되고 다음 도서정보를 입력받겠다
		// 라는 신호를 호출한곳에 return(알림)
		return true;
	
	}

	@Override
	public void listBook() {
		// TODO Auto-generated method stub
		
	}

}

/*
 * com.biz.list : 3단계 패키지, Base Package
 * com.biz.list.exec 
 * 	: 4단계 패키지, 업무적인 분류를 나타내는 package
 */
package com.biz.list.exec ;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListEx_01 {
	
	public static void main(String[] args) {
		
		// Random 클래스를 사용해서 뭔가 수행을을 하기 위한 준비
		// 클래스
		//	   Random 클래스의 인스턴스(Instance), 객체(object)
		//			 rnd 인스턴스를 사용가능하도록 초기화
		//			 new : rnd 인스턴스를 초기화 하겠다 
		//					라는 키워
		//				 생성자(Contructor) method
		Random rnd = new Random();
		// Random 클래스를 사용해서 rnd 인스턴스를 선언하고
		// Random() 생성자를 호출하여 
		//	rnd 인스턴스를 초기화(새로만들기 new)하라 
		
		/*
		 * 다른 클래스와 색다르게
		 * 선언하는 클래스와 초기화하는 생성자의 이름이
		 * 다른 형태를 갖는다
		 * 클래스에 <Generic> 키워드를 포함하여 사용을 한다.
		 * Integer형 데이터를 포함할 intList를 선언하고
		 * 초기화 하는 코드
		 * Integer형 리스트 라고 부른다.
		 * 자바에서 기본 배열형 데이터를 사용하는데 어려움이 있어서
		 * JDK에서 제공해주는 도구를 사용하여
		 * 많은 개수의 데이터를 관리하기 위한 방법을 제공한다.
		 */
		List<Integer> intList = new ArrayList<>();
		// 리스트를 처음 만들면 size() 값이 0인 데이터가
		// 아무것도 없는 리스트가 만들어진다.
		
		intList.add(90); // size() 1인 리스트가 되고 데이터가 1개 추가
		intList.add(100);// 리스트를 데이터 개수만큼 추가하여 사용
		
		
		
		
	}

}

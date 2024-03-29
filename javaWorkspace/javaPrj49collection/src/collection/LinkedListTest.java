package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
	
	public void m01() {
		
		//컬렉션준비
		List x = new LinkedList();
		
		//데이터 넣기
		x.add("one");
		x.add(22222);
		x.add(3.14);
		x.add('z');
		x.add("hello");
		
//		for (타입이름 빵: 봉다리) {
//			
//		}
		// 				0	1	2
		int myArr[] = new int [3];
		myArr[0]= 15;
		myArr[1]= 25;
		myArr[2] =35;
		
//		for (int i = 0; i < myArr.length; i++) {
//			System.out.println(myArr[i]);
//		}
		
		for(int number : myArr) {
			System.out.println(number);
		}
			
			
		//데이터 꺼내기
//		for (Object elem : x) {
//			System.out.println(elem);
//		}
	}

}

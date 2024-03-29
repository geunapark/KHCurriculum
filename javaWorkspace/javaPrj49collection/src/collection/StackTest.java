package collection;

import java.util.Stack;

public class StackTest {

	//Stack만들기
	public void method01() {
		Stack s = new Stack();
	
	//데이터 넣기
		s.push("one");
		s.push("two");
		s.push("three");
		
		//s.clear();
		
		
		
	System.out.println(s.peek());
	System.out.println(s.peek());
	System.out.println(s.peek());
	}
}

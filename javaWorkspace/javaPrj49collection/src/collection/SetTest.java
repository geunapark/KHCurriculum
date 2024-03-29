package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


//중복 ㄴㄴ
//순서 ㄴㄴ
//set test
public class SetTest {
	
	public void method01() {
		//생성
		//HashSet s = new HashSet();
		Set s = new TreeSet();
		
		
		//데이터 넣기
		s.add("one");
		s.add("two");
		s.add("333");
		
		
		//???
		//s.clear();
		//System.out.println("포함 ???" + s.contains("333"));
		System.out.println(s.isEmpty());
		
		//데이터 꺼내기
		System.out.println(s.size());
		
		System.out.println(s.toString());
		//하나씩 꺼내는 거 이터레이터 (하나씩 하나씩 꺼내기)
		Iterator iter =s.iterator();
		
		
		if(iter.hasNext()) {
			System.out.println(iter.next());
		}
	
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}

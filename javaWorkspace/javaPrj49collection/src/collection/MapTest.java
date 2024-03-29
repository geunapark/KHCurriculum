package collection;

import java.util.ArrayList;
import java.util.HashMap;

import vo.Person;

public class MapTest {

	
	public void method01() {
		//ArrayList코드
//		ArrayList<Person> list = new ArrayList<Person>();
//		
//		
//		list.add(new Person("홍길동" ,20,183.7 ,66.7 ));
//		list.add(new Person("김철수",30 ,193,2));
//		list.add(new Person("김영희",15,160.5,46));	
//		
//		for(Object temp : list) {
//			Person p = (Person)temp;
//			if(p.getName().equals("홍길동")) {
//				System.out.println(p);
//				break;
//			}
////		}
		
		
		//생성
		HashMap m = new HashMap();
		
		//데이터 넣기
		m.put("홍길동",new Person("홍길동" ,20,183.7 ,66.7 ));
		m.put("김철수",new Person("김철수",30 ,193,2));
		m.put("김영희",new Person("김영희",15,160.5,46));		
		
		//삭제
		//m.clear();
		//m.remove("김철수");
		//System.out.println("비었나???" + m.isEmpty());
		
		//이거는 입력한 값이 없을때 뒤에있는 걸 출력하게 해줘
		System.out.println(m.getOrDefault("박근아" , "공듀"));
		//System.out.println(m.get("김철수"));
		//System.out.println(m.get("김영희"));
	}
}

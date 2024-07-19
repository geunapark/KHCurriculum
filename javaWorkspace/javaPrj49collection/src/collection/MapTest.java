package collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

import vo.Person;

//key-value
//key 는 중복x
//value는 중복 o
//순서없음
public class MapTest {

	public void method01() {

//		// ArrayList 생성
//		ArrayList<Person> list = new ArrayList<Person>();
//
//		// 데이터 넣기 (person 3명)
//		list.add(new Person("홍길동",20,183.7,66.7));
//		list.add(new Person("김철수",30,173.2,42.7));
//		list.add(new Person("김영희",40,199.9,33.7));
//		
//		// 데이터 꺼내기 (홍길동)
//		for (Person temp : list) {
//			Person p = (Person)temp;
//			if(p.getName().equals("홍길동")) {
//				System.out.println(p);
//				break;
//			}
//		}
		// 생성
		HashMap m = new HashMap();

		// 데이터 넣기
		m.put("홍길동", new Person("홍길동",20,183.7,66.7));
		m.put("김철수", new Person("김철수",30,173.2,42.7));
		m.put("김영희", new Person("김영희",40,199.9,33.7));

//		m.clear();
//		m.remove("김철수");
//		System.out.println(m.isEmpty());
		
		
		// 데이터 꺼내기
		System.out.println(m.getOrDefault("김철수시","김무명"));

	}
}

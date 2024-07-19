package collection;

import java.util.ArrayList;

import kh.KhArrayList;

public class ArrayListTest {

	// ArrayList
//	public void m01() {
//		System.out.println("------ArrayList-------");

		// 어레이 리스트 생성
//		ArrayList x = new ArrayList();
//
//		// 데이터 넣기
//		x.add(3.14);
//		x.add("two");
//		x.add(30);
//		x.add('a');
//		x.add(true);
//		x.add('a');

		// x.remove(2); /두번째 인덱스 지워줌
		// x.remove("two"); /two라는 문자열을 찾아서 지워줌
		// x.clear(); /모두 지워줌
		// System.out.println("어떻게 나옴 : " + x.contains("abc")); /문자열 이 있는지 없는지 true 나
		// false로 알려줌
		// System.out.println("어떻게 : " + x.indexOf('a')); /앞에서부터 몇번째 인덱스에 있는지 알려줌
		// System.out.println("어떻게 : " + x.lastIndexOf('a')); / 뒤에서부터 몇번째 인덱스에있는지 알려줌
		// System.out.println("? : " + x.isEmpty());/비어있는 데이터가 있는지 t/f 로 출력

		// 모든데이터 출력
//		for (Object elem : x) {
//			System.out.println(elem);
//		}

//	}

	public void m02() {
		// 리스트 만들기
		KhArrayList list = new KhArrayList();

		// 데이터 넣기
		list.add("one");
		list.add(222);
		list.add('a');
		list.add(true);
		list.add(3.14);
		list.add("zzzz");
		list.add("aaaaaa");
		
		list.add(3,"삼삼삼");
//		list.remove(2);
//		list.clear();

		// 데이터 꺼내기
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
//		list.add("clear 이후에 처음 넣은 데이터~~~");
//		System.out.println(list.get(0));
	}

}


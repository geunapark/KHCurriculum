package main;

import java.util.ArrayList;

public class MyCollection {
    public void test() {	
        ArrayList<Fruit> list = new ArrayList<Fruit>();
        list.add(new Fruit("사과", "빨강"));
        list.add(new Fruit("메론", "녹색"));
        list.add(new Fruit("포도", "보라"));
        list.add(new Fruit("맛있는 과일", "알수없음"));
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

	


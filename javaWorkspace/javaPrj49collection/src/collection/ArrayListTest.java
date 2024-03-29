package collection;

import java.util.ArrayList;
import kh.KhArrayList;

public class ArrayListTest {
   
   public void m01() {
      
      System.out.println("----ArrayList----");
      
      ArrayList x = new ArrayList();
      
      x.add(3.14);
      x.add("two");
      x.add(30);
      x.add('a');
      x.add(true);
      
      //x.remove(2);
      //x.remove("two");
      //x.clear();
      //System.out.println(x.contains("abbc"));
      //System.out.println(x.indexOf('a'));
      //x.isEmpty();
      
      
      for ( Object elem : x) {
         System.out.println(elem);
         
      }
      
   }
   
   public void m02() {
      
	   
	   //리스트 만들기
      KhArrayList x = new KhArrayList();
      
      
      //데이터 넣기
      x.add("one");
      x.add(222);
      x.add('a');
      x.add(true);
      x.add(3.14);
      x.add("zzzz");
      x.add("aaaaaaa");
      
     x.add(3 , "삼삼삼"); 
      
     //x.remove(2);
     // x.clear();
      
      //데이터 꺼내기
     for(int i = 0; i < x.size() ; i++) {
    	 System.out.println(x.get(i));
     
     }
     
     
     //x.add("test");
     //System.out.println(x.get(0));
     
     
      
   }
   
   
   
}
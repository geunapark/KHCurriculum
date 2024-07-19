package main;

import test.Pokemon;
import test.Tv;
import test.AccountInfo;
import test.Person;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("===== 클래스 작성 연습 =====");
		
		
		AccountInfo a = new AccountInfo();
		a.setName("dd");
		a.setBalance(true);
		
		Tv t = new Tv();
		t.setChannel(5);
		t.setVolume(88);
		
		System.out.println(a);
		System.out.println(t);
		
		
		
		
	}

}

package main;

import test.Person;

public class Main {
	
	public static void main(String[] args) {
		Person []p= new Person[3];
		for(int i=0;i<p.length;i++) {
			p[i].setName(null);
			p[i].setAge(i);
		}
	}

}

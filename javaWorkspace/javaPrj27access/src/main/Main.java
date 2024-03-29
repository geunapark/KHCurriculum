package main;

import mob.Pokemon;

public class Main {

	public static void main(String[] args) {
		System.out.println("=====접근제한자=====");
		
		/* public		-전체공개
		 * protected	-상속관계
		 * default		-같은 패키지에 있으면 접근가능
		 * private		-같은객체 안에서만 가능
		 * 
		 * */
		
		Pokemon x=new Pokemon();
//		x.name="피카츄";
		x.bodyAttack();
	}

}

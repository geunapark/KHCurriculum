package main;

public class Main {

	public static void main(String[] args) {

		System.out.println("====쓰레드====");

		// 쓰레드 만들어서 일 시키기

		new Thread ( 
				() ->{
				String name = Thread.currentThread().getName();
				for (int i = 0; i < 10; i++) {
					System.out.println("[" + name + "]" + i);
				}
			}

		).start();
		
		
		new Thread( () -> {
				String name = Thread.currentThread().getName();
				for (int i = 0; i < 10; i++) {
					System.out.println("[" + name + "]" + i);
				}
		})
		.start();
		
		
		new KhThread().start();
		
		
	}
}

//		KhRunner r01 = new KhRunner();
//		Thread t01 = new Thread(r01);
//		t01.start();
//
//		
//		KhRunner r02 = new KhRunner();
//		Thread t02 = new Thread(r02);
//		t02.start();

//		//KhRunner x = new KhRunner();
//		Thread t1 = new Thread( ()->{System.out.println("안녕 나는 단백이"); });
//		t1.start();
//		

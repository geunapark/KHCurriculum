package main;

public class Main {

	public static void main(String[] args) {

		new Thread(() -> {
			String name = Thread.currentThread().getName();
			for (int i = 0; i < 10; ++i) {
				System.out.println("[" + name + "]" + i);
			}
		}).start();

		new Thread(() -> {
			String name = Thread.currentThread().getName();
			for (int i = 0; i < 10; ++i) {
				System.out.println("[" + name + "]" + i);
			}
		}).start();

		new KhThread().start();
	}
}
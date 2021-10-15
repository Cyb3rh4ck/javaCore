package javacore.threads;

public class Thread02 extends Thread{

	public static void main(String[] args) {
		Thread02 t1 = new Thread02();
		t1.setName("one");
		t1.start();
		
		Thread02 t2 = new Thread02();
		t2.setName("two");
		t2.start();
	}
	
	public void run() {
		System.out.println("Thread name : " + Thread.currentThread().getName());
	}
}

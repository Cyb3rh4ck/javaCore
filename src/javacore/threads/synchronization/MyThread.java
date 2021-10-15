package javacore.threads.synchronization;

public class MyThread extends Thread{

	DisplayMessage dm ;
	String name;
	
	MyThread(DisplayMessage dm, String name) {
		this.dm = dm;
		this.name = name;
	}
	
	public void run() {
		dm.sayHello(name);
	}
	
	public static void main(String[] args) {
		DisplayMessage dm = new DisplayMessage();
		MyThread mt = new MyThread(dm, "Evan");
		mt.start();
	}
}

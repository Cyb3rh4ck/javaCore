package javacore.threads;

public class MultiThreaded extends Thread{
	
	public static void main(String[] args) throws InterruptedException {
		
		MultiThreaded mt = new MultiThreaded();
		mt.setPriority(MIN_PRIORITY);
		mt.setName("rabbit");
		mt.start();
		
		MultiThreaded mt1 = new MultiThreaded();
		mt1.setPriority(MAX_PRIORITY);
		mt1.setName("tourtle");
		mt1.start();
		
	}
	
	public void run() {
		System.out.println("Thread name: " + Thread.currentThread().getName());
	}

}

package thread;

public class ThreadMain {
	public static void main(String[] args) {
		Thread thread1 = new MyThread();
		Thread thread2 = new Thread(new MyThread2());
		
		
		thread2.start();
		thread1.start();
		
		for (int i = 0; i < 10000; i++) {
			System.out.println("main : " + i);
		}
	}
}

class MyThread extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			System.out.println("thread1 : " + i);
		}
	}
}

class MyThread2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			System.out.println("thread2 : " + i );
		}
		
	}
	
}


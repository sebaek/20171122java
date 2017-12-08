package thread;

public class Conc implements Runnable {
	public int number;

	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			inc2();
		}
	}
	
	public synchronized void inc() {
		number++;
	}
	
	public void inc2() {
		synchronized (this) {
			number++;
		}
	}
	
	public static void main(String[] args) throws Exception {
		Conc r = new Conc();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println(r.number);
	}

}

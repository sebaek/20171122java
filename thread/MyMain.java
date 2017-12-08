package thread;

public class MyMain implements Runnable {
	public int i;

	@Override
	public void run() {
		for (int j = 0; j < 100000; j++) {
			inc();

		}
	}

	private void inc() {
			i++;
	}

	public static void main(String[] args) throws Exception {
		MyMain r = new MyMain();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);

		t1.start();
		t2.start();

		t1.join();
		t2.join();
		System.out.println(r.i);
	}
}

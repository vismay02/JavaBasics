//Thread safe- Multiple threads cannot access same method at same time.

class Counter {
	int count;

//synchronized- Only one thread will be running this method at a time
	public synchronized void increment() {
		count++;
	}
}

public class SyncDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Counter c = new Counter();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 1; i <= 10000; i++) {
					c.increment();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 1; i <= 10000; i++) {
					c.increment();
				}
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();

		System.out.println("Count " + c.count);
	}

}
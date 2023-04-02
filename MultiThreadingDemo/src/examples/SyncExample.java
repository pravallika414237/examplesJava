package examples;

class count {
	int count1;

	synchronized void increase() {
		count1++;
	}
}

public class SyncExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		count c1 = new count();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 1; i <= 1000; i++) {
					c1.increase();
				}
			}

		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 1; i <= 1000; i++) {
					c1.increase();
				}

			}

		});
		t1.start();
//t1.join();
		t2.start();
		t2.join();
		System.out.println(c1.count1);
	}

}

package examples;

class A extends Thread {

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("AI:  " + i );
			try {

				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class B implements Runnable {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("bi:  " + i / 0);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class demo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		A a1 = new A();
		B b1 = new B();
		System.out.println(a1.currentThread().getName());
		Thread t1 = new Thread(b1, "satya");
		t1.setDaemon(true);
		a1.setDaemon(true);
		System.out.println(a1.getName());
		a1.setName("pravallika");
		System.out.println("thread name : " + a1.getName() + t1.getName());
            t1.setPriority(1);
            a1.setPriority(Thread.MAX_PRIORITY);
            System.out.println("priority of t1 "+t1.getPriority());
            System.out.println("priority of a1 "+a1.getPriority());
		a1.start();
		t1.start();
		System.out.println(a1.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println("hello"); // daemon thread
//any error in the program all daemon threads are stopped
	}

}

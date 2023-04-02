package durgaJava8;

public class MultiThreadingFunctional {

	public static void main(String[] args) {
		
		Runnable r = ()->
		{
			int [] arr= {14,5,78,87,87,78,02,78};
			for(int a : arr) {
				System.out.println(a);
			}
		};
		
		Thread t1 = new Thread(r);
		
		t1.start();
		
		char [] arr= {'b','d','e','w','o','p','s','q','x','q','m','n'};
		for(char a : arr) {
			System.out.println(a);
		}

	}

}

package durgaJava8;

interface Interf{
	
	void add(int a, int b);
	
	int square(int n);
	
}
public class AnoynomousInnerClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interf i = new Interf() {

			@Override
			public void add(int a, int b) {
				System.out.println(a+b);
			}

			@Override
			public int square(int n) {
				// TODO Auto-generated method stub
				return n*n;
			}
			
		};
		
		i.add(15, 20);
		
		System.out.println("square of " + 5 +"is :" + i.square(5));
		
	}

}

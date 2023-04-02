package durgaJava8;

@FunctionalInterface
interface NoArgLamdaInterface{
	
	public void m1();
	
}

@FunctionalInterface
interface ArgLamdaInterface{
	
	public int m1(int a);
	
}

@FunctionalInterface
interface DoubleArgLamdaInterface{
	
	public int m1(int a , int b);
	
}
public class BasicLamdaExample {

	public static void main(String[] args) {
		
		NoArgLamdaInterface a = () -> System.out.println("hello");
		a.m1();
		
		ArgLamdaInterface b = n -> n*n;
		System.out.println(b.m1(5));
		
		DoubleArgLamdaInterface c = (num1,num2) -> num1 + num2;
		System.out.println(c.m1(45, 25));
		
	}

}

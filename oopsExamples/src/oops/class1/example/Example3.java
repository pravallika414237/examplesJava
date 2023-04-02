package oops.class1.example;
class A{
	int x;
	
	void m1() {
		System.out.println("i am m1");
	}
}

class H extends A{
	@Override
	void m1() {           
		System.out.println("class b m1 method");    
	}
}
public class Example3 {

	public static void main(String[] args) {
		H h = new H();
		h.m1();

		A a= new A();
		a.m1();
	}

}

package encapsulationExample;
class Parent{
	
	void m1() {
		System.out.println("parent method m1 ");
	}
	
	void m1(String s) {
		
		System.out.println("string m1 method in parent");
	}
}

class Child extends Parent{
	
	void m1(int a) {
		System.out.println("child method m1  ");
	}
	
	void m2() {
		
	}
	
}
public class DyanmicBindingExample {
 
	public static void main(String[] args) {
		
		Parent p = new Parent();
		
		Child c = new Child();
		
		Parent p2=  new  Child();
		
		System.out.println(p instanceof Parent);
		System.out.println( c instanceof Child);
		System.out.println(p2 instanceof Child);
		System.out.println(p2 instanceof Parent);
		
		p2.m1();   //dynamic binding
		p.m1();  //static binding
		c.m1();
		p2.m1("hello");
		
		System.out.println(4<<2);
	}
}

package oops.class1.example;
class B{
	private int a=10;
	private void display() {
		System.out.println("i am private" + a);
	}
	
	public void cal() {
		System.out.println("i am public");
	}
	
	protected void get1() {
		System.out.println("i am protected");
	}
}
class C{
	B b2= new B();
//	b2.get1();
//	b2.cal();      //unreachable as they acant be called
	void disp() {        //only called using method
		b2.get1();
		b2.cal();
	}
}

class D extends B
{
	
}
public class AccessSpecifierPrivate {

	public static void main(String[] args) {
		
 B b = new B();
 //b.display(); 
 //private we canot access outside the class
 
 b.cal();  
 //cal method is public
 
 b.get1();
	
//	//There are two ways to declare string array - declaration without size and declare with size. There are two ways to initialize string array - at the time of declaration, populating values after declaration. We can do different kind of processing on string array such as iteration, sorting, searching etc
//	Variables, methods, and constructors, which are declared protected in a superclass can be accessed only by the subclasses in other package or any class within the package of the protected members' class. The protected access modifier cannot be applied to class and interfaces.

	D d = new D() ;
	d.cal();
	d.get1();
	}
}

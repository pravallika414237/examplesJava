package oops.class1.example;
class BAnotherClass{
	int a;
	void get1() {
		System.out.println("hello");
	}
	
	
	
	class innerClass{
		
		int b=0;
		
		void inner() {
			System.out.println("hello inner class");
		}
	}
	
	innerClass c2 = new innerClass();   //creation of object of inner class outside the inner class
}
public class InnerClassExample {

	public static void main(String[] args) {
		BAnotherClass c1 = new BAnotherClass();   //creation of object of anotherclass
 c1.c2.b=9;                                   //object.object.variable
 c1.c2.inner();
	}

}

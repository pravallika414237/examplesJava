package oops.class1.example;
class AnotherClass{
	int a;
	static void get1() {
		System.out.println("hello");
	}
	
	
static	class innerClass{
		
		int b=0;
		
		void inner() {
			System.out.println("hello inner class");
		}
	}}
public class StaticInnerClass {

	public static void main(String[] args) {
		AnotherClass.innerClass c1 = new AnotherClass.innerClass();
		System.out.println(c1.b=9); //when there  is nested inner class which is static.
		 c1.inner();
       AnotherClass.get1();  //method is static no need to create object.
	}

}

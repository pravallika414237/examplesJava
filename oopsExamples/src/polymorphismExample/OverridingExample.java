package polymorphismExample;
class Parent{
	void add(int a , int b) {
		System.out.println("addition from parent is :" +(a+b));
	}
	void display() {
		System.out.println("message from parent");	
	}
}

class child extends Parent{
	void display() {
		System.out.println("message from child");
	}
	
}
public class OverridingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child v= new child();
		v.display();      //overiding the display child display method is displayed.
		v.add(10,50);
	}

}

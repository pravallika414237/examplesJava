

//Create an abstract class 'Parent' with a method 'message'. It has two subclasses each having a method with the same name 'message' that prints "This is first subclass" and "This is second subclass" respectively. Call the methods 'message' by creating an object for each subclass.
	
	abstract class Parent1{
	abstract void message(); 
		Parent1(){
			
		}
	}
	
	abstract class Parent2{
		abstract void message(); 
			Parent2(){
				
			}
		}
	
	class Child1 extends Parent1{
		void message() {
			System.out.println("This is first subclass ");
		}
	}
	
	class Child2 extends Parent1{
		void message() {
			System.out.println("This is Secound subclass ");
		}
	}
	public class AbstractExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child1 c1 = new Child1();
		c1.message();
		
		 Child2 c2= new  Child2();
		 c2.message();
		 
		 Parent1 p = new Child1();
		 p.message();
		 
		 Parent1 p2 = new Child2();
		 p2.message();
	}

}

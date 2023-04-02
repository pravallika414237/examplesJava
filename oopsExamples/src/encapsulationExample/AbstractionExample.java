package encapsulationExample;

abstract class Abc{
	
	abstract void add();
	
	 void add(int a) {
		 
	 }
	
	abstract  int add(int a, int b);
	
	 void display() {
		System.out.println("hello world  :  ");
	}
}

class Def extends Abc{

	@Override
	void add() {
		System.out.println(" extended class implementation: ");
	}
	@Override
	void display() {
		System.out.println(" overwritten ");
	}
	
	
	@Override
	int add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("sum is : ");
		return a+b;
	}
	
}

public class AbstractionExample {

	public static void main(String[] args) {
		
		Def d= new Def();
		d.add();
        d.display();
       
        System.out.println( d.add(10,20));
	}

}

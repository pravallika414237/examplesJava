package constructorExample;
class parent{
	
	parent(){
		
	}
	
	parent(String s){
		
		System.out.println(s);
		
	}
}

class child extends parent{
	int x;
	child(){
		System.out.println("child no-arg constructor invoked");
	}
	child(int a){
		this.x=a;
		System.out.println("child parametric constructor invoked");
	}
	void display(){
		System.out.println(x);
		
	}
}

public class SuperInhertitanceConstructor {

	public static void main(String[] args) {
		child c = new child();
		c.display();

		child a = new child(50);
		a.display();
		
		child b = new child();
	}

}

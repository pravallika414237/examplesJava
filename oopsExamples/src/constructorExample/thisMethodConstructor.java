package constructorExample;

class thisMethod{
	
	thisMethod(){
		this("string constructor called");
		System.out.println("no-arg parent called");
	}
   thisMethod(String s){
		this(500);
		System.out.println(s);
	}
   thisMethod(int a){
	 System.out.println(a);
}
	
}

class childThisMethod extends thisMethod{
	
	childThisMethod(){
		System.out.println("no arg child constructor");
	}
	childThisMethod(String p){
		System.out.println(p);
	}
}
public class thisMethodConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("parent class object");
		thisMethod t = new thisMethod();
		
		System.out.println("child class object");
		childThisMethod l = new childThisMethod();
		
		System.out.println("child class object with string arg:  ");
		childThisMethod l2 = new childThisMethod("hello");
		
	}

}

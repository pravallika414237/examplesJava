package constructorExample;

class AddOne{
	//char ch;    //\u0000--default for char
	int a;
	int b;
	static String s="edubridge";
	AddOne(){
		this.a=10;
		this.b=70;
		System.out.println("no arg constructor values are :" + a +","+b); 
	}
	
	AddOne(int a , int b){
		
		this.a=a;
		this.b=b;
		
		System.out.println("parametric constructor invoked" +a+","+b);
	}
	void displaySum() {
		int c= a+b;
		System.out.println("sum of two numbers is : "+ c + s);
	}
}
public class DefaultParametricNoArgConstructor {

	public static void main(String[] args) {
		
		AddOne a= new AddOne();
		a.displaySum();
		AddOne b  = new AddOne(23,89);
 //constructor is invoked based on the argument types
	}

}

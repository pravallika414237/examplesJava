package polymorphismExample;
class A{
	//different data types with different sequence...
	void add(int a, int b) {
		System.out.println("addition is :  "+ (a+b));
	}
	
	void add(float a, int b) {
		System.out.println(" float addition is :  "+ (a+b));
	}
	void add(int a, double b) {
		System.out.println("double addition is :  "+ (a+b));
	}
//	void add(int x,int y) {
//		
//	}
	
}
public class overloadingAndOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      A a1= new A();
      //method overloading
      a1.add(15,45);
      a1.add(85.0f, 10);
      a1.add(45, 14.5);
	}

}

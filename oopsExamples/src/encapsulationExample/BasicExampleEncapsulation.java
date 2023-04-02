package encapsulationExample;
class A{
	String addMethod(int a,int b) {
	
		return "addition = "+(a+b);
	}
	
	float addMethod(int a, float b) {
		
		return a+b;
	}
	
	float addMethod(float a, int b) {
		
		return a+b;
	}
	
	void abc(int a , int b) {
		int c =a+b;
		System.out.println(c);
	}
}

public class BasicExampleEncapsulation {

	public static void main(String[] args) {
		
		A a= new A();
		
		String sum=a.addMethod(52,45);
         
		System.out.println("with variable : "+sum);
		System.out.println(a.addMethod(50,20));
//		System.out.println();a.addMethod(12.5f, 50);
//		
		a.abc(22, 12);
//		System.out.println(a.abc(10, 2));  //no return
	}

}

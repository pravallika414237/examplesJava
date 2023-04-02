package HandlingExceptions;
class A{
	
	void m1() {
		System.out.println(10/0);
	}
}
public class ThroesAndThrow  {

	public static void main(String[] args)  {
		A a = new A();
		try 
		{
		a.m1();
		}
		catch(Exception e) {
		System.out.println("testing for ae");
	}
	}
}

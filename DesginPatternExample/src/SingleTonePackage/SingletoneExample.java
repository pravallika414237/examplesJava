package SingleTonePackage;

public class SingletoneExample {
	private static SingletoneExample obj = new SingletoneExample();

	private SingletoneExample() {

	}
	public static SingletoneExample getInstance() {
		return obj;
		
	}

	public void showMessage() {
System.out.println("hello");
	}
	
}

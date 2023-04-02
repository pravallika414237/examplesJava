package HandlingExceptions;
class AgeCal{
	void age(int a) {
		
		if(a<18) {  //user defined exception 
			throw new ArithmeticException("wait till u reach 18yrs");
		}
		else {
			System.out.println("great you are an adult.");
		}
	}
}
public class IoExceptionExample extends RuntimeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AgeCal c = new AgeCal();
		try {
		c.age(15);
		}
		catch(Exception e) {
			System.out.println("try again with different number");
		}
	}

}

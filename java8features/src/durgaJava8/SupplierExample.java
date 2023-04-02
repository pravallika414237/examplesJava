package durgaJava8;
import java.util.Date;
import java.util.function.*;

public class SupplierExample {

	public static void main(String [] args) {
		 
		//Date
		Supplier<Date> s =() -> new Date();
		
		System.out.println(s.get());
		
		//Random Number
		Supplier<String> s2 = () -> {
			String otp ="";
			for(int i = 0; i<5 ;i++) {
				otp = otp +(int)( Math.random()*10);
			}
			return otp;
		};
		
		System.out.println(s2.get());
	}
}

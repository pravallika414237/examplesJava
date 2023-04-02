package basicpackage;
import java.util.*;

public class AddingofInput {

	public static void main(String[] args) {
		
		Scanner s1 =new Scanner(System.in);
		System.out.println("Enter value1:");
		int a=s1.nextInt();
		System.out.println("Enter value2:");
		int b=s1.nextInt();
		
		System.out.println("multiply:"+ (a*b));

		System.out.println(fun());
	}

	  static int fun() {
		// TODO Auto-generated method stub
		return 80;
	}

}

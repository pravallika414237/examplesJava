package importStatements;
import java.util.ArrayList;            //explicit import statement
import java.util.*;                  //implicit import statement

import java.math.BigInteger;
public class ArrayListExample {

	public static void main(String[] args) {
		
//		ArrayList l = new ArrayList();
//		can be written if it is imported.
		
//		//if array list is not imported then
//		
//	java.util.ArrayList<E> A = new java.util.ArrayList();  //fully qualified name
		
		String a ="97";
		BigInteger b = new BigInteger(a);
		
		System.out.println(b.isProbablePrime(1)?"prime":"not prime");
		
		// if biginteger is not imported then
		
		java.math.BigInteger b1 = new java.math.BigInteger(a);
		
		System.out.println(b1.isProbablePrime(1)?"prime":"not prime");
		
	}

}

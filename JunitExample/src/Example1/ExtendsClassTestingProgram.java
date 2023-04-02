package Example1;

import junit.framework.TestCase;

public class ExtendsClassTestingProgram extends TestCase  {

	int a, b;

	public void setUp() {
		a = 4;
		b = 2;
	}

	public void testadd() {
		int c = a + b;
		System.out.println("value of c is" + c);
		assertTrue(c == 6);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ExtendsClassTestingProgram a = new  ExtendsClassTestingProgram();
		a.testadd();
	}

}

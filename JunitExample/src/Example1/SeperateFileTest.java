package Example1;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SeperateFileTest {
	Example e = new Example();
	
	@Before
	public void valueset() {
		e.a=2;
		e.b=26;
	}
	@Test   //or  Test(timeout==100)
	public void methodTest() {
		e.sum();
		assertTrue(e.c==30);
	}
	
	@After
	public void completeTest(){
		e.a=0;
		e.b=0;
		System.out.println("value of a : "+ e.a);
		System.out.println("value of b : "+ e.b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeperateFileTest f= new SeperateFileTest();
		f.methodTest();
		}
	}



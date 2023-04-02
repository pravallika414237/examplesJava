package Example1;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class AnnotationsExample {
String org;
@Test
public void show() {
	org="EDUBRIDGE";
	System.out.println("name is :" + org);
	assertEquals(org, "EDUBRIDGE");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationsExample a= new AnnotationsExample();
		a.show();

	}

}

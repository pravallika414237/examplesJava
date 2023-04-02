package StringStringbufferexample;

public class StrtingClassConstructors {

	public static void main(String[] args) {
char []ch= {'a','b','c','d'};
byte []a= {65,98,99,68,69,78,100};

//creates string object with byte (ONLY) array
String s8= new String(a,2,4);
String s9= new String(a);
   System.out.println(s8+" ----"+ s9);


   //creates empty string object
    String s= new String();
    System.out.println(s +"--");
	

	//creates string object literal
	String s1= new String("hello");
	System.out.println(s1 );
	
	//creates string object with stringBuffer
		StringBuffer s2= new StringBuffer("hello");
		StringBuffer s3= new StringBuffer("hello");
		
		String s4= new String(s2);
		
		System.out.println(s2 +" "+s3 +" " +s4 );
		System.out.println(s4.equals(s2));
		System.out.println(s4.equals(s3));
		//content comparsion of string and stringbuffer returns false.
		
		//creates string object with stringbuilder
       StringBuilder s5= new StringBuilder("hello");
		
		String s6= new String(s5);
		
		System.out.println(s5 +"..." +s6 );
		
		//creates string object with char array
		 String s7= new String(ch);
		    System.out.println(s7 +"--");
		    
		 
	}	}



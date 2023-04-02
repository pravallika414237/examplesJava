package StringStringbufferexample;

public class MutableImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//immutabilty of string	
		String s= "java";
		String s1=s.concat(" world"); 
		//providing new refrence or reassigning the refrences should be done.
		System.out.println(s);
		System.out.println(s1);

		 //mutability of stringbuffer 
		StringBuffer sb= new StringBuffer("hello");
		sb.append(" welcome to java ");
		System.out.println(sb);

		//mutability of string builder

		StringBuilder sbu=new StringBuilder("how");
		sbu.append(" are you ?? ");
		System.out.println(sbu);
		
	}

}

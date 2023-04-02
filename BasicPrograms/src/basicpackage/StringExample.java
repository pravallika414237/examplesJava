package basicpackage;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		char [] ch=new char[20];
		String str=s.concat(" welcome"); //concat
		System.out.println(s);
		System.out.println(str);

		str.getChars(0, 5, ch, 0);   //getChars
		System.out.println(ch);
		
		String str2="Java";
		String str1=" ";
		char []c=str2.toCharArray();  //tocharArray
	
		System.out.println(c[0]);
		System.out.println(str1.isEmpty()); //isEmpty
		System.out.println(str1.isBlank()); //isBlank
		
		System.out.println(str2.toLowerCase());
		System.out.println(str2.toUpperCase());
		
		StringBuffer sb= new StringBuffer("geeks");
	
	}
	

}

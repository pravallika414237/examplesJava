package StringStringbufferexample;

public class DotEqualsStringStringBuffer {

	public static void main(String[] args) {
		
	//string constant pool concept concept of content comparision & refreence comparision.
String s= "java";
String s1= "java";

System.out.println(s==s1);
System.out.println(s1.equals(s));

   //string object creation --> content  & refreence comparision.
 String s3= new String("pravallika");
 String s4= new String("pravallika"); 
 System.out.println(s3==s4);                    //refrence comparsion
 System.out.println(s3.equals(s4));        //content comparsion
 
 
 // stringbuffer --> content  & refreence comparision.
StringBuffer sb1= new StringBuffer("hello");
StringBuffer sb2= new StringBuffer("hello");
System.out.println(sb1==sb2);

//string builder --> content  & refreence comparision.

StringBuilder sbu1=new StringBuilder("how");
StringBuilder sbu2=new StringBuilder("how");
System.out.println(sbu1==sbu2);
System.out.println(sbu1.equals(sbu2));
// OBJECT CLASS .equals () for refrence comparsion.
//   In child class string .equals() method is overidden for content comparsion.
//   In child class stringBuffer .equals() method is NOT overidden.so it is for refrence comparsion.
	}

}

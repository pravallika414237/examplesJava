package StringStringbufferexample;

public class StringMethods {

	public static void main(String[] args) {
//getBytes(), equals(), hashCode() and equalsIgnoreCase(), indexOf() and lastIndexOf(), substring() and 
//		subSequence() ,
 
		String s = new String("    ef HI    small chello ygeokpj girl is caab   ");
		String s1=s;
	 
		String s3=s.toLowerCase();
		String s4="girl";
		
		System.out.println("getbyte --"+s.getBytes());     //how to print array???
		System.out.println("equals --"+s1.equals(s));
		//
		
		 System.out.println("a represnts unicode category of: " + Character.getType('/'));
		System.out.println("hashcode:::>>"+s.hashCode()); 
		//sometimes the hashcode calculation itself goes beyond the Integer.MAX_VALUE, i.e 2147483647. what happens then is that we get a negative 
		//integer after the overflow. Negative hashcode is perfectly valid!
		//what value???
		
	
		
		System.out.println("equalsignorecase --"+s3.equalsIgnoreCase(s)); 
		//consider spaces  (.trim()) ---false
		
		
		
		//indexOf
		System.out.println("indexOf int(unicode) arg--"+s.indexOf(97)); //give unicode values
		System.out.println("indexOf substring arg--"+s.indexOf(s4));  //gives index value of substring s4 in s
		System.out.println("indexOf int arg checking from given index--"+s.indexOf(97, 1)); 
		//checks the unicode value of given int from 4th index.
		
		System.out.println("indexOf string arg checking from given index--"+s.indexOf(s4, 12));
		//checks the substring s4 from 12th index (starts from 11
		
		// SIMILAR TO indexOf but checks from last and returns index value
		System.out.println("lastindexOf int(unicode) arg--"+s.lastIndexOf(97));  //
		System.out.println("lastindexOf substring arg--"+s.lastIndexOf(s4));
		System.out.println("lastindexOf int arg checking from given index--> "+s.lastIndexOf(98, 4));  //last???
		System.out.println("lastindexOf string arg checking from given index--"+s.lastIndexOf(s4, 15));//
		
		//substring
		System.out.println("substring --"+s.substring(10));
		System.out.println("substring --"+s.substring(5,20));
		
		//subsequence
		System.out.println("substring --"+s.subSequence(10, 20));
		//What is diff between substring and subseq..???
		
	//matches(), replace(), replaceFirst(), and replaceAll(), split(), lines(), 
		
		String s5= new String(" ef small c girl is caab");
		//MATCHES 
		//s5.append("hellocew");
		System.out.println("substring --"+s.matches(s5));  
		//content comparsion (s4--false content , ref differ , s1 --- true ref,content same)  
		//what is diff between matches and equalss?
		
		//REPLACE
		//System.out.println("replace--"+s.replace(a,z));  
		//showing error for arguments
		String b=new String("hello");
		System.out.println("replace--"+s.replace(s4, b));  //??how its worknig
		System.out.println("replaceall--"+s.replaceAll(s5, b));            
		//replace s5 with b content.
		System.out.println("replacefirst--"+s.replaceFirst(s5, b));      
		//replace s5 with b content.????difference
		
		//split
		
		System.out.println("spplit--"+s1.split(" "));      //??
		//lines
		System.out.println("lines--"+b.lines());   //output??
		
		//indent(), transform(), format(),
//		intern(), 	
		
		//indent
		System.out.println("indent--"+s.indent(5));
		//System.out.println("transform--"+s.transform(s5));   //??
		//System.out.println("format--"+s.format(b,null));       //replace s5 with b
		
		System.out.println("intern--"+s.intern());          //output??
		
		//valueOf() and copyValueOf(),copyvalueof repeat(), describeConstable() and
		//resolveConstantDesc(), formatted(), 
//		stripIndent(), and translateEscapes(),trim(), strip(), stripLeading(), and stripTrailing()
//		startsWith() and endsWith()
		
		               //valueof
		char []ch= {'a','b','d','l'};
		System.out.println("valueof--boolean:::"+String.valueOf(false)); //arg??
		System.out.println("valueof--cahr==="+String.valueOf(s4));    //printing s4
		System.out.println("valueof--chararray=="+String.valueOf(ch));
		System.out.println("valueof--double=="+String.valueOf(012.45));
		System.out.println("valueof--float=="+String.valueOf(52.98f));
		System.out.println("valueof--int=="+String.valueOf(589984518));
		System.out.println("valueof--long=="+String.valueOf(451846523));
		System.out.println("valueof--object=="+String.valueOf(b));
		System.out.println("valueof--cahr array int offset int count=="+String.valueOf(ch, 1, 2));
		
		
		    //copyValueOf()//13/12/2022
		
		System.out.println("copyvalueof--"+s4.copyValueOf(ch));
		System.out.println("copy valueof--"+s.copyValueOf(ch, 1,2 ));    //???
		
		//repeat
		System.out.println("repeat-->: "+s4.repeat(3));
		//describeConstable
		System.out.println("describeConstable " + s.describeConstable());
		//resolveconstantDesc
		//System.out.println("resolveConstantDesc: "+ s.resolveConstantDesc());   //??
		
		
		//formatted
		System.out.println("formatted :"+ s4.formatted(args));
		
		
		//strip,stripindent
		
		System.out.println("stripindent :"+ s1.stripIndent()+".?"); 
		//remove white spaces at start and end.
		System.out.println("strip :"+s1.strip()+".");
		// diff between strip indent and strip ,trim same output remove space at start and end???
		System.out.println("stripleading :"+s1.stripLeading()+".");
		//remove space only at start.
		System.out.println("striptrailing :"+s1.stripTrailing()+".");
		//removes spaces at end.
		
		
		//and translateEscapes(),trim(),startWith(),endsWith()
		
		String g="///???hi  ??hello  }{\\u005C'";
	//	System.out.println("trnslateescapees :"+g.translateEscapes());  //???
		
		System.out.println("trim :"+s1.trim()+".");
		System.out.println("startwith :"+s1.startsWith(" "));
		System.out.println("startwith :"+s1.startsWith(s4,10 ));
		System.out.println("endswith :"+s1.endsWith("caab   "));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
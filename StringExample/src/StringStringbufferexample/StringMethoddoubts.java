package StringStringbufferexample;

import java.io.UnsupportedEncodingException;

public class StringMethoddoubts {

	public static void main(String[] args) {
		//GETBYTES, HASHCODE,SPLIT,
 String s= "abc";
 byte []b= s.getBytes();  //stores string in (unicode) byte
 for(int i=0;i<s.length();i++) {
	 System.out.println(b[i]);
 }
 
 
 byte []b1;
 //different getyte unicode values( utf-8,16,32/)
 try {
	b1= s.getBytes("UTF-16");  //stores string in (unicode) byte
	 for(int i=0;i<b.length;i++) {
		 System.out.println(b[i]);
	 }
	 
 } catch(UnsupportedEncodingException e)
 { }

 System.out.println(s.hashCode());	
	//
	//s[0]*31pow( n-1)---
 //   98*31 pow(2) --- 98*961----
 //   99*31 pow(1)----99*31
 //  100*31 pow  0 ----100*1
 String s2="01a:2:a1998";
 String arr[]=s2.split(":",4); //split into 3 at":" and removes the character
 for(String g :arr) System.out.println(g);
 
 String a="hello , wel-come , how-are";
// String[]b2=a.split(",");
// for(String g :b2) {
//	   String []str=g.split("-"); 
//	     for(String h:str)
//	        System.out.println(h);
	     
	     //The Java String class compareTo() method compares the given string with the current string lexicographically. It returns a positive number, negative number, or 0.
	     String s3 = "fvhgbjnkm";
	System.out.println(s2.compareTo(s3));
 }
 
 
 }
 
	



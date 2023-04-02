package collectionsExamples;
import java.util.*;
public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Vector v= new Vector();
   v.add(85);
   v.add("pravallika");
   v.add("8684512");
   v.add('i');
   
   System.out.println(v);
   
   List  <String> l = new  ArrayList <String> ();
	//a list interface can be implemented using arraylist , linkedlist , vector, stack.
l.add("hi");
l.add("java");
l.add("abcd");
l.add("html");
l.add("csssss");

   
	Vector v2= new Vector(l);
	v2.addAll(v);
	v2.add(852554);
	v2.add("java");
	System.out.println(v2);
	
	

   v2.removeAll(v);
   System.out.println("removed collection :"+ v2);
    v.clear();
    System.out.println(v);
    
//	Iterator i = v.iterator();
//	while(i.hasNext()) {
//		System.out.println(i.next());
//	}
//    System.out.println(v.get(1));
//    v.remove(1);
//    System.out.println(v);
//    
//    
}
}
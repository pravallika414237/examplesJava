package collectionsExamples;

import java.util.*;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List <Integer> l = new LinkedList <Integer>();
l.add(12);
l.add(122);
l.add(512);
l.add(18452);

System.out.println(l);

Iterator i = l.iterator();
while(i.hasNext()) {
	System.out.println(i.next());
}

LinkedList l2= new LinkedList();
l2.add("pravallika");
l2.add(89);
l2.add('i');
l2.add("satya");
System.out.println(l2);
//adding another collection
l2.add(2, l);
System.out.println(l2);
 

//addfirst , addlast
l2.addFirst("hello");
l2.addLast("kuppila");
System.out.println(l2);

//reverser order printiing
Iterator a2= l2.descendingIterator();
while(a2.hasNext()) {
	System.out.println(a2.next());
}
LinkedList<String> l3 = new LinkedList<String>();
l3= (LinkedList)l2.clone();
l2.clear();
System.out.println("empteied list : "+ l2);
System.out.println("shallow copy of l2 :"+ l3);

//getting first element
System.out.println("first element is : "+ l3.getFirst());
System.out.println("last element is : "+ l3.getLast());
System.out.println( l3.get(0));
//When the rate of addition or removal rate is more than the read scenarios, then go for the LinkedList. On the other hand, when the frequency of the read scenarios is more than the addition or removal rate, then ArrayList takes precedence over LinkedList.


	}

}

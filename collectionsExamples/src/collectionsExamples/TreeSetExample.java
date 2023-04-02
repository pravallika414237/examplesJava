package collectionsExamples;
import java.util.*;
public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//underlying data structure is BALANCED TREE
		TreeSet<Integer> h= new TreeSet<>();
		h.add(5);
		h.add(25);
		h.add(36);
		h.add(356);
		//h.add("hello");
		//h.add(null);     // null insertion not possible,, heterogenous not possible.

		Iterator<Integer> i = h.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println(h);
		
		System.out.println(h.add(36));     //duplicates not allowed.
 
		//INSERTION  ORDER NOT PRESERVED
		System.out.println(h.pollFirst());
		System.out.println(h.pollLast());
		System.out.println(h);
		System.out.println(h.size());
		System.out.println(h.contains(85));
		System.out.println(h.floor(56));
		System.out.println(h.floor(20));
		

}
}
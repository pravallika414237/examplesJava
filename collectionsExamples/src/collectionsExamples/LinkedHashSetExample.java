package collectionsExamples;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//datastructure is linkedlist and hash table.
		//HashSet is an unordered & unsorted collection of the data set, whereas the LinkedHashSet is an ordered and sorted collection of HashSet.
		LinkedHashSet h= new LinkedHashSet();
		h.add(85);
		h.add("hello");
		h.add(36);
		h.add("hiu");
		h.add(null);         //null insertion possible

		Iterator i = h.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println(h);
		
		System.out.println(h.add(36));
		
			}
	}



package durgaJava8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsFunctional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> list = new ArrayList<Integer> ();
list.add(45);
list.add(78);
list.add(41);
list.add(14);
list.add(89);
list.add(21);
list.add(6);
list.add(36);
list.add(47);

System.out.println(list); 
Collections.sort(list);   // NATURAL SORING ORDER
System.out.println(list);

Comparator <Integer> c= (int1 , int2) -> int1<int2?1:int1>int2?-1:0;  //custom sorting
Collections.sort(list, c);

//Collections.sort(list, (int1 , int2) -> int1<int2?1:int1>int2?-1:0); 

System.out.println(list);

list.stream().forEach(System.out::println);


	}

}

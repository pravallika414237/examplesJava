package mapExample;

import java.util.*;

public class NavigableMapExample {

	public static void main(String[] args) {

		NavigableMap  m= new TreeMap();
		
		m.put("pravallika",101);
		m.put("haet",101);
		//m.put("sai",null);   //null not possible for values
		m.put("iolj",89);
		m.put("ika",52);
		//duplicates not allowedd for keys , 
		System.out.println(m);
		m.putIfAbsent("sllika", 0);
		System.out.println(m);
		System.out.println(m.firstEntry());
		/////System.out.println(m.floorKey(m)); //throwing error??
		System.out.println(m);          // giving all methods of map navigablemap , sorted map

	}

}

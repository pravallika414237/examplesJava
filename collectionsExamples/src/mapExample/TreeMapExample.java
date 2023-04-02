package mapExample;
import java.util.*;
import java.util.TreeMap;
class CustomComprator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1= o1.toString();
		String s2=o2.toString();
		return s2.compareTo(s1);
	}
	
}
public class TreeMapExample {
	public static void main(String[] args) {
	TreeMap m= new TreeMap();
	// ds : red-black-tree
	
	//natural sorting order
	m.put("pravallika",101);
	m.put("haet",101);
	m.put("sai",null);   //null  possible for values
	m.put("iolj",89);
	m.put("ika",52);
	                  //duplicates not allowedd for keys ,

	System.out.println(m);
//	m.putIfAbsent("sllika", 0);
//	System.out.println(m);
//	System.out.println(m.containsValue(89));  //true
	
	TreeMap m2= new TreeMap(new CustomComprator());
	// ds : red-black-tree
	
	//natural sorting order
	m2.put("pravallika",101);
	m2.put("haet",101);
	m2.put("sai",null);   //null  possible for values
	m2.put("iolj",89);
	m2.put("ika",52);
	                  //duplicates not allowedd for keys , 
	System.out.println(m2);
	
	
}}

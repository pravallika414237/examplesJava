package collectionsExamples;
import java.util.*;
public class SetExampleHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Set s = new HashSet();
  Set s2  = new HashSet();
  s.add("hello");
  s.add(58);
  s.add(96);
  s2.add(58);
  s2.add(95);
  s2.add("hi");
  System.out.println(s +"and "+ s2);
  
 
  
  s.retainAll(s2);
  System.out.println(s);
  
  s.removeAll(s2);
  System.out.println(s);
  
  //s.containsAll(s2);
  System.out.println(s.containsAll(s2));
  
  s.addAll(s2);
  System.out.println(s);
  //union - addAll , intersect - retainAll,
  //minus -removeAll  ,containsAll
  
  
	}

}

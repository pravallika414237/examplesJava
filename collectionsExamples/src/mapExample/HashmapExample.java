package mapExample;
import java.util.*;
public class HashmapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map m= new HashMap();
		m.put("pravallika",101);
		m.put("haet",101);
		m.put("sai",null);   //null not possible for values
		m.put("iolj",89);
		m.put("ika",52);  //duplicates not allowedd for keys , 
		System.out.println(m);
		m.putIfAbsent("sllika", 0);
		System.out.println(m);
		
		
		

	}

}

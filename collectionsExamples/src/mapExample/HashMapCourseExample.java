package mapExample;
import java.util.*;
public class HashMapCourseExample {

	public static void main(String[] args) {
//		//write a program using hashmap
//		and store coursename as key
//		and course description as a value
//		atleast 10 values
//		Display the Menu as Course List
//		and Allow user to enter the course name
//		and based on course name print the description
//		the program should also check to exit
//		if your says yes then exit the program
//		or else continue
//	
		HashMap<String ,String> course = new HashMap<>();
    
		course.put("html", "price : 500 frontend technology its is a markup language");
		course.put("css", "price : 550 frontend technology");
		course.put("js", "price : 800 frontend technology");
		course.put("ts", "price : 700 frontend technology");
		course.put("bootstrap", "price : 400 frontend technology");
		course.put("java", "price : 5800 frontend technology");
		course.put("adv.java", "price : 6000 frontend technology");
		course.put("sql", "price : 4500 frontend technology");
		course.put("devops", "price : 3500 frontend technology");
		course.put("jdbc", "price : 1500 frontend technology");
		
		//Iterator i = (Iterator) course.entrySet();
		boolean flag=true;
		for(Map.Entry<String, String> h : course.entrySet()) {
			{
				System.out.println(h.getKey());
			}
		}
		System.out.println(" enter exit to exit:");
		
		while(flag) {
			Scanner sc =  new Scanner(System.in);
			System.out.println("enter course name : ");
			String key1= sc.nextLine();
			
			if("exit".equals(key1)) {
				flag = false;
				System.out.println("exit done.");
				return;
			}
			
			String result = course.get(key1);
			
			if(result != null) {
				
			System.out.println(result);
			}
			else {
				System.out.println("eneter valid key.");
			}
		
			
		}

		
	}

}

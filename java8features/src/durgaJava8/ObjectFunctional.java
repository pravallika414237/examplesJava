package durgaJava8;
import java.util.*;

class Employee{
	int empid;
	String name;
	boolean admin;
    String dept;
	int salary;
    
    Employee(int empid,String name,boolean admin,String dept){
    	this.empid = empid;
    	this.name = name;
    	this.admin= admin;
       this.dept= dept;
    	
    }

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", admin=" + admin + ", dept=" + dept + "]";
	}
    
    
}
public class ObjectFunctional {

	public static void main(String [] args) {
		ArrayList <Employee> list = new ArrayList<Employee>();
		list.add(new Employee(101 ,  "pravallika" , true , "IT"));
		list.add(new Employee(102 ,  "vallika" , false , "services"));
		list.add(new Employee(11 ,  "malika" , true , "IT"));
		list.add(new Employee(15 ,  "asha" , false , "tele communication"));
		list.add(new Employee(18 ,  "bindu" , false , "NON-IT"));
		list.add(new Employee(801 ,  "harini" , true , "IT"));
		
		System.out.println(list);
		
		Comparator <Employee> c = (a,b) ->  (a.empid > b.empid)?1:( a.empid < b.empid )? -1:0;
		Collections.sort(list ,c);
		System.out.println("________________-");
		System.out.println(list);
		
		
	}
}
package durgaJava8;
import java.util.function.*;
class Student{
	int id;
	String name;
	int marks;
	Student(int id,String name,int marks){
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}	
}

public class FunctionExample {

	public static void main(String[] args) {
		
		Predicate<Student> p = (e) -> e.marks>50;
		
		Function <Student,Student> fun = new Function<Student,Student>()
		{
			
			@Override
			public Student apply(Student e) 
			{
				
				if(p.test(e)) {
					e.marks = e.marks+5;
					
				}
				return e;
			}
			
		};
		
		Student s = new Student(101,"prav" ,55);
		
System.out.println(fun.apply(s));
	}

}

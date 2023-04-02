package oops.class1.example;
class sumMethod{
	int age;
	
	void increment() {
		age++;
	}
	
	void display() {
		System.out.println(age);
	}
}
public class InstanceMembers {

	public static void main(String[] args) {
	
sumMethod d= new sumMethod() ;

d.display();
d.increment();
d.display();
	}

}

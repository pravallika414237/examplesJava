package constructorExample;

class StudentDetails {
	public static String name ="abc";
	String age;
	String schoolNmae;
	String rollNo;
	String city;
	
	public StudentDetails() {
		// TODO Auto-generated constructor stub
	}

	//public StudentDetails(String name, String age, String schoolNmae, String rollNo, String city) {
	public StudentDetails(String age, String schoolNmae, String rollNo, String city) {
		super();
		//name = name;
		this.age = age;
		this.schoolNmae = schoolNmae;
		this.rollNo = rollNo;
		this.city = city;
		System.out.println("In constructor Name -> "+name+" and RollNo is "+this.rollNo);
	}

	public void populate(String age, String schoolNmae, String rollNo, String city) {
		this.age = age;
		this.schoolNmae = schoolNmae;
		this.rollNo = rollNo;
		this.city = city;
		
		System.out.println("In populate() Name -> "+name+" and RollNo is "+this.rollNo);
	}

	public void m2() {
		System.out.println("Name -> "+name+" and RollNo is "+this.rollNo);
	}

	public static void m1() {
		System.out.println("Name -> "+name);
	}

}

public class ClassCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Instance ===== Method");
		StudentDetails s1 = new StudentDetails("","","10000","");
		
		//StudentDetails s1 = new StudentDetails();
		s1.populate("","","1","");
		
		//s1.m2();
		/*
		 * StudentDetails s2 = new StudentDetails("","","2",""); s2.m2();
		 * 
		 * StudentDetails s3 = new StudentDetails("","","3",""); s3.m2();
		 * 
		 * StudentDetails s4 = new StudentDetails("","","4",""); s4.m2();
		 * 
		 * System.out.println("Static ===== Method"); StudentDetails.m1();
		 */
	}
}

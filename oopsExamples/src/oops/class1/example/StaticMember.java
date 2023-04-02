package oops.class1.example;
 class MemberCreation{
	static String schoolName="abcd";;
//	String name;
//	String age;
//	
	MemberCreation(){
		schoolName= "abcd";
	}                         //when object is not created constructor is not called.
	
	static void newSchool() {
		schoolName = "werfg";
	}
	
	static void displayName() {
		System.out.println(schoolName);
	}
}
public class StaticMember {

	public static void main(String[] args) {
		
   MemberCreation.displayName();
   MemberCreation.newSchool();
   MemberCreation.displayName();
	}

}

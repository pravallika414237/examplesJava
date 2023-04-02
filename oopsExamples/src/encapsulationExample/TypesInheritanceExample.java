package encapsulationExample;
class Animal{
	int head=1;
	
}
class Bird extends Animal{
	int legs=4;
	
	void sound() {
		System.out.println("kkk ....");
	}
	
}//Animal class inherited by 2classes inheritance hierarcy

class WildAnimas extends  Animal{
	void sound() {
		System.out.println("ammbaaa");
	}
	
}

class crow extends Bird{
	void sound() {
		System.out.println("redtcfvygb");
	}
	
}
//
//class pig extends Animal,WildAnimas{
//multiple inheritance NOT possible
//}
public class TypesInheritanceExample {

	public static void main(String[] args) {
	Bird a= new  Bird();
		 System.out.println(a.head);
		 System.out.println(a.legs);
		 
          a.sound();

     WildAnimas w = new WildAnimas();
        w.sound();
        
        crow c = new crow();
        c.sound();
	}

}

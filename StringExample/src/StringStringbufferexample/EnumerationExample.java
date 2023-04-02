package StringStringbufferexample;

public class EnumerationExample {

	public enum weekdays{
		sunday(0),monday(1),tuesday(2),wednesday(3),thursday(4),
		friday(5),saturday(6);

	final int i;
	
	weekdays(int j){
		
		this.i=j;
	}
	
	public int getDay() {
		
	return this.i;
	}
	}
	
   public enum size{
	 
	 small("size is small",0),
	 medium("medium size",8),
	 large("size is large",7);
	 
	 final String s1;
	 final int l;
	 size(String s2, int i){
		 
		 this.s1=s2;
		 this.l=i;
	 }
	  String getValue() {
		  
		  return this.s1;
	  }
	  int getInt() {
		  return this.l;
	  }
 }
  

 
	public static void main(String[] args) {
		
weekdays w= weekdays.thursday;
System.out.println(w.getDay());


size s3= size.large;
System.out.println(s3.getValue() +" ---"+ s3.getInt());
	}

}

package basicpackage;

public class ArrayExample {

	public static void main(String[] args) {
		
	int []marks= {95,89,54,41,46,82};
		   System.out.println(marks.length);  //length() method and length is property.
           System.out.println(marks[3]);
           
    System.out.println("loop is starting: ");

    for(int i=0;i<marks.length;i++) {
	          System.out.println(marks[i]);
	}
    int clonemarks[]=marks.clone();
    System.out.println("clone loop is starting: ");
    
    for(int i:clonemarks) {
	            System.out.println(i);
	   }


	}

}

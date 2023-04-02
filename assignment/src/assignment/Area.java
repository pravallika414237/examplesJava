package assignment;
import java.util.*;

class Rectange{
    long length ;
    long  breath;
	
	Rectange(long length,long breath){
		this.length=length;
		this.breath=breath;
		
}
	public long returnArea(){
		long area=length*breath;
		return area;
		
	}
}

public class Area {

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		System.out.println("ENTER LENGTH: ");
		long length=s.nextLong();
		System.out.println("ENTER BREATH: ");
		long breath=s.nextLong();
		
		Rectange r=new Rectange(length, breath);
		//r.returnArea();
		System.out.println("AREA OF RECTANGLE IS : "+r.returnArea());
		
	}

}

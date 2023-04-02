package FileHandlingExamples;
import java.util.*;
import java.io.*;
public class FileOutputStreamExample {

	public static void main(String[] args)  throws IOException{
		// TODO Auto-generated method stub
File f = new File("example1.txt");
FileOutputStream fo= new FileOutputStream(f,true);
Scanner sc= new Scanner(System.in);
String message;

System.out.println("enetr the message:");
message="\n"+sc.nextLine() ;
fo.write(0);
byte[] b= message.getBytes();
fo.write(b);   //fo.write(message.getBytes());
fo.close();

	}

}

package FileHandlingExamples;
import java.io.*;
//import java.util.*;
public class FileStreamExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File f = new File("example1.txt");
FileInputStream fi= new FileInputStream(f);
int i= fi.read();
while(i!= -1) {
	//System.out.println("\n");
	System.out.print((char)i);
	i=fi.read();
}
	}

}

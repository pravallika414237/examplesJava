package FileHandlingExamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.*;
import java.io.IOException;
import java.util.*;

public class DocyorDetails {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File f = new File("DoctorDetails.txt");
//f.createNewFile();
FileReader fr= new FileReader(f);

List doctorName= new ArrayList();
List doctorGrade= new ArrayList();

BufferedReader br=  new BufferedReader(fr);
String doctorDetails;

while((doctorDetails=br.readLine())!=null)
{
	doctorDetails.replace(doctorDetails, "hello");
	
}
	}

}

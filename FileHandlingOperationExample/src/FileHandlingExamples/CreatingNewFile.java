package FileHandlingExamples;

import java.io.*;

public class CreatingNewFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter f;
		FileReader r = null;
		File file;
		try {

			file = new File("F:/EDUBRIDGE/java/example1.txt");
			f = new FileWriter("example1.txt");
			f.write("welcome  to  2023 ");
			f.close();

			r = new FileReader("example1.txt");
			char []c = new char[200];
			
			r.read(c);
			System.out.println(c);

			if (file.createNewFile()) {
				System.out.println("New File is created!");
			} else {
				System.out.println("File already exists.");
			}

		} catch (Exception e) {
			// if any error occurs
			e.printStackTrace();
		} finally {
			try {
				r.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}

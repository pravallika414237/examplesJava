package examples;
import java.io.*;
public class processBuilderExample {

	public static void main(String [] args) throws IOException, InterruptedException {
		ProcessBuilder pb = new ProcessBuilder("calc.exe");
		Process p= pb.start();
		System.out.println("waiting for application to load ....");
		Thread.sleep(20000);
		p.destroyForcibly();
		System.out.println("application closed successfully..");
	}
}

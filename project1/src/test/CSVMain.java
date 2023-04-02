/*
 * package test;
 * 
 * import java.io.File; import java.io.FileNotFoundException; import
 * java.io.PrintWriter; import java.util.ArrayList; import java.util.Scanner;
 * 
 * public class CSVMain {
 * 
 * public static void main(String[] args) { ArrayList<Song> songList = new
 * ArrayList<Song>(); boolean repeat = true;
 * 
 * try { Scanner read = new Scanner(new File("E:\\test.txt.txt")); do { String
 * line = read.nextLine(); String[] tokens = line.split(","); songList.add(new
 * Song(tokens[0], tokens[1], tokens[2], tokens[3])); saveFile(songList); }
 * while (read.hasNext()); read.close(); } catch (FileNotFoundException e) {
 * System.out.println("File not found."); }
 * 
 * while (repeat) { System.out.println("\nSelect a Function");
 * 
 * System.out.println("1. Search Song"); System.out.println("2. Add Song");
 * System.out.println("3. Delete Song"); System.out.println("4. Display Songs");
 * System.out.println("5. Quit");
 * 
 * 
 * switch (5) {
 * 
 * case 1: // searchSong(songList); break; case 2: // addSong(songList); break;
 * case 3: // deleteSong(songList); break; case 4: // displaySorted(songList);
 * break; case 5: saveFile(songList); repeat = false; break; } } }
 * 
 * public static void saveFile(ArrayList<Song> songList) { try { PrintWriter
 * writer = new PrintWriter("E:\\test.txt.txt"); for (int i = 0; i <
 * songList.size(); i++) { writer.println(i); } writer.close(); } catch
 * (FileNotFoundException e) { System.out.println("File not found."); } } }
 */
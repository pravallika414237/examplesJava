package collectionsExamples;

import java.util.*;

public class ArrayListDataSorting {
	public static void ascending(ArrayList<Integer> l) {
		System.out.println("Original array is : " + l);
		System.out.println("Ascending out put of array :");
		for (int i = 0; i < l.size(); i++) {
			for (int j = 0; j < l.size(); j++) {
				if (l.get(i) < l.get(j)) {
					
					Integer temp = l.get(i); 
					l.set(i, l.get(j));    
					l.set(j, temp);      
				}
			}
		}
		System.out.println(l);
	
//		Collections.sort(l);
//		System.out.println(l);

	}

	public static void descending(ArrayList<Integer> l) {
		System.out.println("Original array is : " + l);
		System.out.println("descending out put of array : ");
		for (int i = 0; i < l.size(); i++) {
			for (int j = 0; j < l.size(); j++) {
				if (l.get(i) > l.get(j)) {
					Integer temp = l.get(i);
					l.set(i, l.get(j));
					l.set(j, temp);
				}
			}
		}
		System.out.println(l);
//		Collections.sort(l,Collections.reverseOrder());
//		
//		System.out.println(l);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = true;
		ArrayList<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(4);
		l.add(13);
		l.add(450);
		l.add(505);
		l.add(60);
		l.add(75);
		l.add(25);
		l.add(358);
		l.add(1000);
		System.out.println(l);

		do {

			Scanner sc = new Scanner(System.in);
			System.out.println("choose any option :\n 1.Ascending Order \n 2.Descending Order ");
			System.out.println("Enter your Option Number :");
			int a = sc.nextInt();

			switch (a) {
			case 1: {
				ascending(l);
				break;
			}
			case 2: {
				descending(l);
				break;
			}

			default: {
				System.out.println("wrong entry...");
			}
			}

			flag = false;
		} while (flag);

	}

}

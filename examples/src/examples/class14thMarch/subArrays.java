package examples.class14thMarch;

import java.util.ArrayList;
import java.util.List;

public class subArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array1 =  {2,4,7,16,9};
List<List<Integer>> resList =  solve(array1);
System.out.println(resList);

	}

	private static List<List<Integer>> solve(int[] array1) {
		List<List<Integer>> resList = new ArrayList<>();
		
		for(int i=0; i< array1.length; i++) {
			
			List<Integer> temp = new ArrayList<>();
			for(int j=i ; j< array1.length; j++) {
				temp.add(array1[j]);
				
				resList.add(new ArrayList<>(temp));
			}
		}
		 
		return resList;
	}

}

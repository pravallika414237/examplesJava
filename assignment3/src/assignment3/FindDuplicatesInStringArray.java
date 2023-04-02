package assignment3;

public class FindDuplicatesInStringArray {

	public static void main(String[] args) {
		String []s= {"prav","llika","satya","llika","satya"};
		for(int i=0;i<s.length;i++) 
		{ 
			for(int j=i+1;j<s.length;j++)
		   {
			if(s[i].equals(s[j])&&(i!=j)) {
				System.out.println("Duplicate element is : "+ s[i]);
			}
		   }
			
		}
	}

}

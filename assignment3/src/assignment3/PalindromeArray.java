package assignment3;

public class PalindromeArray {

	public static void main(String[] args) {

		final int[] b = { 45, 2, 85, 2, 45,89 };

		boolean flag = true;
		int i = 0, j = b.length - 1;
		
		  while (i<j) 
		  {
			  if (b[i] == b[j])
			  { 
			  flag=true;
			  i++;
			  j--;
		  
		      } 
			  else if (b[i] != b[j])
			  { 
				  flag = false;
		        //System.out.println("not a palindrome."); 
		          break;
		          }
		  
		  } 
		 

		
		
		/*
		 * while (i < j) { if (b[i] != b[j]) { flag = false; break; } else { i++; j--; }
		 * }
		 */
		 
		  if(flag) 
		  { 
			  System.out.println("PALINDROME"); 
		  }
		  else
		  {
			  System.out.println("NoT A PALINDROME"); 
			  }
		 

	}
}
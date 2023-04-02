package stringExamples1;

import java.util.Arrays;

public class AnagramExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "cas";
		String s2 = "Scar";

		if (s1.length() == s2.length()) {
			char[] ch1 = s1.toLowerCase().toCharArray();
			char[] ch2 = s2.toLowerCase().toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);

			if(Arrays.equals(ch1, ch2)) {
				System.out.println("anagram");
			}
			
		}
		else {
			System.out.println("not anagram");
		}
	}

}

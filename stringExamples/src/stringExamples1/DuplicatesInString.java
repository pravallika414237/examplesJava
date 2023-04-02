package stringExamples1;

public class DuplicatesInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "geeks for greeks";
		char[] ch = s1.toCharArray();
		int count;
		System.out.println("duplicates in string :");
		for (int i = 0; i < ch.length; i++) {
			count = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j] && ch[i] != ' ') {
					count++;
					ch[j]='0';
				}
			}
			
			if(count > 1 && ch[i] !='0')
			{
				System.out.println(ch[i]);
			}
		}
	}

}

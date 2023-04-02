package lamdaExpression;

import java.util.Scanner;

@FunctionalInterface
interface Validation {

	boolean validate(String s1, String s2);
}

public class Source {

	public static void main(String[] args) {

		Validation v = (s1, s2) -> {
			if ("ABC".equals(s1) && "DEF".equals(s2)) {
				return true;
			} else {
				return false;
			}
		};

		try (Scanner sc = new Scanner(System.in)) {
			String userName = sc.nextLine();
			String passWord = sc.nextLine();
			System.out.println(v.validate(userName, passWord));
		}
	}
}

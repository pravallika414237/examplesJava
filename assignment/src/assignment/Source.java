package assignment;

import java.util.stream.Collectors;

public class Source {
	public String insertSpace(String s) {
		return s.chars().mapToObj(c -> (char)c+" ").collect(Collectors.joining());
	}
	public static void main(String[] args) {
		Source source = new Source();
		System.out.println(source.insertSpace("capgemini"));
	}
}
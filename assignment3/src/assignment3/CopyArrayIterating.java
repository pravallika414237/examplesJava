package assignment3;

import java.util.Arrays;

public class CopyArrayIterating {

	public static void main(String[] args) {
		int a[]= {5,7,9,45};
		int n=a.length;
		int b[] = new int [n];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
					}
		System.out.println(Arrays.toString(b));

	}

}

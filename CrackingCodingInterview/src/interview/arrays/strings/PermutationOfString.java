package interview.arrays.strings;

import java.util.Arrays;
import java.util.Scanner;

public class PermutationOfString {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String str = sc.next();
			String s = sc.next();

			if (str.length() != s.length()) {
				System.out.println("Given string is not permutation of each other.");
			} else {
				char a[] = str.toCharArray();
				char b[] = s.toCharArray();
				Arrays.sort(a);
				Arrays.sort(b);
				str = new String(a);
				s = new String(b);
				if (str.equals(s)) {
					System.out.println("Given strings are permuation of each other");
				} else {
					System.out.println("Given string is not permutation of each other.");
				}

			}
		}

	}

}

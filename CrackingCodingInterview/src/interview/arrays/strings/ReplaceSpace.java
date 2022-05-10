package interview.arrays.strings;

import java.util.Scanner;

public class ReplaceSpace {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in)) {
			String str = sc.nextLine();
			str = replaceSpace(str);
			System.out.println(str);

		}
	}

	public static String replaceSpace(String str) {
		char[] c = str.toCharArray();
		char[] ch = new char[100];
		int count = 0;
		for (int i = 0; i < c.length; i++) {
			if (c[i] == ' ') {
				ch[count] = '%';
				ch[count + 1] = '2';
				count++;
				ch[count + 2] = '\0';
				count++;
			} else {
				ch[count] = c[i];
			}
			count++;
		}
		return new String(ch);
	}

}

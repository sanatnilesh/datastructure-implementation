package interview.arrays.strings;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class OneAwayEdit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String source = sc.next();
		String target = sc.next();
		char c[] = source.toCharArray();
		char t[] = target.toCharArray();
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		for (char d : c) {
			if (hashMap.get(d) != null) {
				int value = hashMap.get(d);
				value = value + 1;
				hashMap.put(d, value);
			} else {
				hashMap.put(d, 1);
			}
		}
		System.out.println(hashMap);
		for (char d : t) {
			if (hashMap.get(d) != null && hashMap.get(d) > 0) {
				int value = hashMap.get(d);
				hashMap.put(d, value-1);
			}
		}
		System.out.println(hashMap);
		Collection<Integer> values = hashMap.values();
		int sum = 0;
		for (Iterator iterator = values.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			sum = sum + integer;
		}
		if (sum == 1 || sum == 0) {
			System.out.println("One Away or Zero distance");
		}else {
			System.out.println("More than one away distance");
		}
	}
}

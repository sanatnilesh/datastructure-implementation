package interview.arrays.strings;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

/**
 * Implement an algorithm to check whether string has all unique character or
 * not.
 * 
 * @author Sanatkumar
 *
 */
public class UniqueStringCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputString = sc.next();

		// Brute force approach
		// First convert user Input string into Charcter array.
		// this actually taking O(n^2)
		Boolean value = isChacterUnique(inputString);
		System.out.println("is given string have unique charcter? " + value);

		// Use data structure such as HashMap/HashTable/Set
		// This will take O(n) time where n is the length of the string
		checkWithHashtable(inputString);

	}

	private static void checkWithHashtable(String inputString) {
		Hashtable<Character, Integer> hashtable = new Hashtable<>();
		char c[] = inputString.toCharArray();
		for (char d : c) {
			hashtable.put(d, 1);
		}
		int length = 0;
		for (Map.Entry<Character, Integer> entry : hashtable.entrySet()) {
			length++;
		}
		if (length == inputString.length()) {
			System.out.println("All charcter in Strings are Unique");
		} else {
			System.out.println("String have duplicate character");
		}
	}

	private static Boolean isChacterUnique(String inputSting) {
		char c[] = inputSting.toCharArray();
		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] == c[j]) {
					return false;
				}
			}
		}
		return true;
	}
}

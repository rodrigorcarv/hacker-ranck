package br.com.rrc.hackerranck.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 
	Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.

	Complete the function in the editor. If  and  are case-insensitive anagrams, print "Anagrams"; otherwise, print "Not Anagrams" instead.

	Input Format

		The first line contains a string denoting . 
		The second line contains a string denoting .

	Constraints

		1 <= length(a), length(b) <= 50
		Strings  and  consist of English alphabetic characters.
		The comparison should NOT be case sensitive.

	Output Format

		Print "Anagrams" if  and  are case-insensitive anagrams of each other; otherwise, print "Not Anagrams" instead.

	Sample Input 0

		anagram
		margana
	
	Sample Output 0

		Anagrams
		Explanation 0

	Character	Frequency: anagram	Frequency: margana
	A or a	          3	                  3
	G or g	          1	                  1
	N or n	          1	                  1
	M or m	          1	                  1
	R or r	          1	                  1

	The two strings contain all the same letters in the same frequencies, so we print "Anagrams".

	Sample Input 1

		anagramm
		marganaa

	Sample Output 1

		Not Anagrams
		Explanation 1

	Character	Frequency: anagramm	Frequency: marganaa
	A or a	      3	                  4
	G or g	      1	                  1
	N or n	      1	                  1
	M or m	      2	                  1
	R or r	      1	                  1

	The two strings don't contain the same number of a's and m's, so we print "Not Anagrams".

	Sample Input 2

		Hello
		hello

	Sample Output 2

		Anagrams
		Explanation 2

	Character	Frequency: Hello	Frequency: hello
	E or e	      1	                  1
	H or h	      1	                  1
	L or l	      2	                  2
	O or o	      1	                  1

	The two strings contain all the same letters in the same frequencies, so we print "Anagrams".
 
 */

public class JavaAnagrams {

	static boolean isAnagram(String a, String b) {
		// Complete the function

		boolean isValidA = a.length() >= 1 && a.length() <= 50;
		boolean isValidB = b.length() >= 1 && b.length() <= 50;

		if (isValidA && isValidB) {

			Map<Character, Integer> mapStringA = mapString(a.toUpperCase());
			Map<Character, Integer> mapStringB = mapString(b.toUpperCase());

			if (mapStringA.values().size() == mapStringB.values().size()) {

				for (Character character : mapStringA.keySet()) {

					if (mapStringA.get(character).equals(mapStringB.get(character))) {
						mapStringB.remove(character);
					} else {
						break;
					}
				}
				
				if (mapStringB.size() == 0) {
					return true;
				}
			}
		}
		return false;
	}

	private static Map<Character, Integer> mapString(String a) {

		Map<Character, Integer> mapChar = new HashMap<>();

		for (Character s : a.toCharArray()) {

			if (mapChar.containsKey(s)) {
				mapChar.put(s, mapChar.get(s) + 1);
			} else {
				mapChar.put(s, 1);
			}
		}
		return mapChar;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}
}
package br.com.rrc.hackerranck.java;

/**
We define the following terms:

Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows: 

    A < B < ... < Y < Z <a <b < ... <y < z

For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball.

A substring of a string is a contiguous block of characters in the string. For example, the substrings of abc are a, b, c, ab, bc, and abc.
Given a string, , and an integer, k, complete the function so that it finds the lexicographically smallest and largest substrings of length k.

    Input Format

        The first line contains a string denoting s. 
        The second line contains an integer denoting k.

    Constraints

        1 <= |s| ,= 1000 consists of English alphabetic letters only (i.e., [a-zA-Z]).

    Output Format

        Return the respective lexicographically smallest and largest substrings as a single newline-separated string.

    Sample Input 0

        welcometojava
        3

    Sample Output 0

        ava
        wel

    Explanation 0

        String s = welcometojava has the following lexicographically-ordered substrings of length :

        ["ava", "com", "elc", "eto", "jav", "lco", "met", "oja", "ome", "toj", "wel"]

        We then return the first (lexicographically smallest) substring and the last (lexicographically largest) substring as two newline-separated values (i.e., ava\nwel).

        The stub code in the editor then prints ava as our first line of output and wel as our second line of output.
 */
import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class JavaSubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        SortedSet<String> subStrings = new TreeSet<String>();
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {

            if (k+i <= charArray.length) {
                char[] copyOfRange = Arrays.copyOfRange(charArray, i, i+k);
                subStrings.add(new String(copyOfRange));
            }
        }

        for (String suString : subStrings) {
            System.out.println(suString.toString());
        }

        return subStrings.first() + "\n" + subStrings.last();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}

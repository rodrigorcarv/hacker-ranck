package br.com.rrc.hackerranck.java;

/**
Given a string, , and two indices, start and end, print a substring consisting of all characters in the inclusive range from  to . 
You'll find the String class' substring method helpful in completing this challenge.

Input Format

    The first line contains a single string denoting . 
    The second line contains two space-separated integers denoting the respective values of and .

Constraints

    1 <= |s| <= 100
    0 <= start < end <= n


    String  consists of English alphabetic letters (i.e., ) only.

Output Format

    Print the substring in the inclusive range from start to end -1 .

Sample Input

    Helloworld
    3 7

Sample Output

    lowo

Explanation

    In the diagram below, the substring is highlighted in green:


 */

import java.util.Scanner;

public class JavaSubstring {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        boolean isRangeValid = S.length() > 0 && S.length() <= 100;
        boolean isStartValid = start >= 0 && start < S.length();
        boolean isEndValid = end >= start && end <= S.length();

        if (S.matches("[A-Za-z]+") && isRangeValid && isStartValid && isEndValid){
            System.out.println(S.substring(start, end));
            
        }
    }
}

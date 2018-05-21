package br.com.rrc.hackerranck.java;

/**
    A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.(Wikipedia)
    
    Given a string A , print Yes if it is a palindrome, print No otherwise.

    Constraints

        A will consist at most 50 lower case english letters.

    Sample Input

        madam

    Sample Output

        Yes
**/

import java.util.Scanner;

public class JavaStringReversePaliativa {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        StringBuffer buffer = new  StringBuffer();
        for(int i = A.toCharArray().length-1; i>= 0;  i --) {
            buffer.append(A.charAt(i));
        }
        System.out.println(buffer.toString().equals(A)? "Yes":"No");
    }
}
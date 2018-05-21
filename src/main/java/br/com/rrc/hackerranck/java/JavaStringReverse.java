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

public class JavaStringReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        boolean isPalindrome = new StringBuffer().append(A).reverse().toString().equals(A);

        System.out.println(isPalindrome? "Yes" : "No");
    }
}

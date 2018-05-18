package br.com.rrc.hackerranck.algorithms;

/**
Complete the function solveMeFirst to compute the sum of two integers.

Function prototype:

    int solveMeFirst(int x, int y);

    where,

        x is the first integer input.
        y is the second integer input
Return values

    sum of the above two integers

Sample Input

    x = 2
    y = 3

Sample Output

    5
    
Explanation

    The sum of the two integers  and  is computed as: 2 + 3 = 5.
 */
import java.util.Scanner;

public class SolveMeFirst {

    static int solveMeFirst(int a, int b) {
        return a + b;
    }

 @SuppressWarnings("resource")
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
    }
}
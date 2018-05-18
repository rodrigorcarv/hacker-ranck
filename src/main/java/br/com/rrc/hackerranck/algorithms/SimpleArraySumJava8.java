package br.com.rrc.hackerranck.algorithms;

/**
 
Given an array of integers, find the sum of its elements.

Input Format

    The first line contains an integer, n, denoting the size of the array. 
    The second line contains n space-separated integers representing the array's elements.

Output Format

    Print the sum of the array's elements as a single integer.

Sample Input

    6
    1 2 3 4 10 11

Sample Output

    31

Explanation

    We print the sum of the array's elements: 1 + 2 + 3 + 4 + 10 + 11 = 31.
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class SimpleArraySumJava8 {

    /*
     * Complete the simpleArraySum function below.
     */
    static int simpleArraySum(int[] ar) {
        return Arrays.stream(ar).sum();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int arCount = Integer.parseInt(scanner.nextLine().trim());

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().trim().split(" ");

        for (int arItr = 0; arItr < arCount; arItr++) {
            int arItem = Integer.parseInt(arItems[arItr].trim());
            ar[arItr] = arItem;
        }

        System.out.println(simpleArraySum(ar));
    }
}

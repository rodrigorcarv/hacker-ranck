package br.com.rrc.hackerranck.algorithms;

/**
    Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a 
    scale from 1 to 100 for three categories: problem clarity, originality, and difficulty.

    We define the rating for Alice's challenge to be the triplet  A = (a[0], a[1], a[2]), and the rating for Bob's 
    challenge to be the triplet B = (b[0], b[1], b[2]) .

    Your task is to find their comparison points by comparing a[0] with b[1], a[1] with b[1], and a[2] with b[2].

    If a[i] > b[i], then Alice is awarded  point.
    If a[i] < b[i], then Bob is awarded  point.
    If a[i] = b[i], then neither person receives a point.

    Comparison points is the total points a person earned.

    Given A and B, can you compare the two challenges and print their respective comparison points?

    Input Format

        The first line contains 3 space-separated integers, a[0], a[1], and a[2], describing the respective values in triplet A. 
        The second line contains 3 space-separated integers, b[0], b[1], and b[2],, describing the respective values in triplet B.

    Constraints

        1 <= a[i] <= 100
        1 <= b[i] <= 100

    Output Format

        Print two space-separated integers denoting the respective comparison points earned by Alice and Bob.

    Sample Input

        5 6 7
        3 6 10
    
    Sample Output

        1 1 

    Explanation

        In this example:
            A = (a[0], a[1], a[2]) = (5, 6, 7)
            B = (b[0], b[1], b[2]) = (3, 6, 10)


        Now, let's compare each individual score:

            a[0] > b[0], so Alice receives 1 point.
            a[1] = b[1], so nobody receives a point.
            a[0] < b[0], so Bob receives 1 point.

        Alice's comparison score is 1, and Bob's comparison score is 1. Thus, we print 1 1 (Alice's comparison score followed by Bob's 
        comparison score) on a single line.

**/

import java.io.IOException;
import java.util.Scanner;

public class CompareTheTriplets {

    // Complete the solve function below.
    static int[] solve(int[] a, int[] b) {

        int[] points = new int[2];

        if (a.length == 3 && a.length == 3) {

            for (int i = 0; i < 3; i++) {

                if (a[i] >= 1 && a[i] <=100 && b[i] >= 1 && b[i] <=100) {

                    if (a[i] < b[i]) {
                        points[1]++;
                    } else if (a[i] > b[i]) {
                        points[0]++;
                    }
                }
            }
        }
        return points;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[] a = new int[3];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 3; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] b = new int[3];

        String[] bItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 3; i++) {
            int bItem = Integer.parseInt(bItems[i]);
            b[i] = bItem;
        }

        int[] result = solve(a, b);

        for (int i = 0; i < result.length; i++) {
            System.out.println(String.valueOf(result[i]));

            if (i != result.length - 1) {
                System.out.println(" ");
            }
        }

        scanner.close();
    }
}


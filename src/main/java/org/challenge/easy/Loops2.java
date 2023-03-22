package org.challenge.easy;

import java.util.Scanner;

public class Loops2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int queries = in.nextInt();

        for (int i = 0; i < queries; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for (int j = 0; j < n; j++) {
                a += (int) Math.pow(2, j) * b;
                System.out.print(a + " ");
            }
            System.out.println();
        }

        in.close();
    }
}

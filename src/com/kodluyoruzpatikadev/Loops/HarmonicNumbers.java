package com.kodluyoruzpatikadev.Loops;

import java.util.Scanner;

public class HarmonicNumbers {
    public static void main(String[] args) {
        int n;
        double total = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the N number");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            total += (double) 1 / i;
        }
        System.out.println(total);
    }
}

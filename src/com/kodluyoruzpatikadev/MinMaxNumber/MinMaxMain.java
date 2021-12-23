package com.kodluyoruzpatikadev.MinMaxNumber;

import java.util.Scanner;

public class MinMaxMain {
    public static void main(String[] args) {
        int min, max, number;

        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will you enter: ");
        number = input.nextInt();
        min = 0;
        max = 0;
        for (int i = 1; i <= number; i++) {
            System.out.println(i + ". enter number : ");
            int sayi = input.nextInt();

            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        System.out.println("The largest number: " + max);
        System.out.println("The smallest number: " + min);

    }
}

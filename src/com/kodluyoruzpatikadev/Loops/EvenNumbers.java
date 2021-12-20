package com.kodluyoruzpatikadev.Loops;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number");
        number = input.nextInt();

        /*
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }
         */
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i%4 == 0) {
                System.out.println(i);
            }

        }

    }
}

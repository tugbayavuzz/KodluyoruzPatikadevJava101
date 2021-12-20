package com.kodluyoruzpatikadev.Loops;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number");
        number = input.nextInt();

        //Program to Find Even Numbers Up To The Entered Number
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }

        //Program that calculates the average of numbers divisible by 3 and 4 from numbers from 0 to the number entered.
        int total = 0, count = 0;
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                total += i;
                count++;
            }
        }
        System.out.println("Average : " + (total / count));
    }
}

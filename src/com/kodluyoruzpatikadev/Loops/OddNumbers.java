package com.kodluyoruzpatikadev.Loops;

import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        int number, total = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Enter the number");
            number = input.nextInt();
            if ((number % 2 == 0) || (number % 4 == 0)) {
                total += number;
            }
        } while (number % 2 == 0);
        System.out.println("Total : " + total);
    }
}

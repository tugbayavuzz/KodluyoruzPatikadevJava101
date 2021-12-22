package com.kodluyoruzpatikadev.Loops;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        int number, total = 0, count = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number");
        number = input.nextInt();

        //Program to Find Even Numbers Up To The Entered Number
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }
/* ************************************************************************************************** */
        //Program that calculates the average of numbers divisible by 3 and 4 from numbers from 0 to the number entered.

        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                total += i;
                count++;
                System.out.println("Average : " + (total / count));
            }
        }

/* ************************************************************************************************** */
        //Program to Find Powers of 2 Less Than Entered Number
        for (int i = 2; i <= number; i*=2){
            System.out.println(i);
        }

/* **************************************************************************************************** */
        //Program that prints powers of 4 and 5 up to the entered number
        for (int i = 1; i <= number; i *= 4){

            System.out.println(i);
        }

        System.out.println("*********************");

        for (int j = 1; j <= number; j*=5){
            System.out.println(j);
        }


    }
}

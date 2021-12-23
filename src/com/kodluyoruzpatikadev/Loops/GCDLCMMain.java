package com.kodluyoruzpatikadev.Loops;

import java.util.Scanner;

public class GCDLCMMain {
    public static void main(String[] args) {

        int number1, number2, ebob = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number1:");
        number1 = input.nextInt();

        System.out.print("Enter the number2:");
        number2 = input.nextInt();


// ebob için for ve while kullanılarak yazilan kod
        if (number1 < number2) {
            for (int i = 1; i <= number1; i++) {
                if (number1 % i == 0 && number2 % i == 0) {
                    System.out.println(i);
                    ebob = i;
                }
            }
            System.out.println("---------------------------");
            for (int k = number1; k >= 0; k--) {
                if (number1 % k == 0 && number2 % k == 0) {
                    ebob = k;
                    System.out.println(ebob);
                    break;
                }
            }

            //with while loops lcd
            int j = number1;
            while (j >= 0) {
                if (number1 % j == 0 && number2 % j == 0) {
                    ebob = j;
                    System.out.println(ebob);
                    break;
                }
                j--;
            }
        }


// ekok için for ve while kullanılarak yazilan kod
        for (int k = number1; k >= 1; k--) {
            if (number1 % k == 0 && number2 % k == 0) {
                ebob = k;
                break;
            }
        }

        for (int l = 1; l <= (number1 * number2); l++) {
            if (l % number1 == 0 && l % number2 == 0) {
                System.out.println(l);
                break;
            }
        }

        int t = number1;
        while (t <= (number1 * number2)) {
            if (number1 % t == 0 && number2 % t == 0) {
                System.out.println(t);
                break;
            }
            t++;
        }
        System.out.println((number1 * number2) / ebob);
    }
}

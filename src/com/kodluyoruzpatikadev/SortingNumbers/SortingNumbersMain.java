package com.kodluyoruzpatikadev.SortingNumbers;

import java.util.Scanner;

public class SortingNumbersMain {
    public static void main(String[] args) {
        int num1, num2, num3, a, b, c;


        Scanner input = new Scanner(System.in);

        System.out.println("Enter the 1. number");
        num1 = input.nextInt();

        System.out.println("Enter the 2. number");
        num2 = input.nextInt();

        System.out.println("Enter the 3. number");
        num3 = input.nextInt();

        if ((num1 > num2) && (num1 > num3)) {
            if (num2 > num3) {
                System.out.println(+num1 + ">" + num2 + ">" + num3);
            } else
                System.out.println(+num1 + ">" + num3 + ">" + num2);
        } else if ((num2 > num1) && (num2 > num3)) {
            if ((num1 > num3)) {
                System.out.println(+num2 + ">" + num1 + ">" + num3);
            } else
                System.out.println(+num2 + ">" + num3 + ">" + num1);
        }

/** *********************************************************************/

        System.out.println("Enter the 1. number");
        a = input.nextInt();

        System.out.println("Enter the 2. number");
        b = input.nextInt();

        System.out.println("Enter the 3. number");
        c = input.nextInt();

        if ((a < b) && (a < c)) {
            if (b < c) {
                System.out.println(+a + "<" + b + "<" + c);
            } else
                System.out.println(+a + "<" + c + "<" + b);
        } else if ((b < a) && (b < c)) {
            if ((a < c)) {
                System.out.println(+b + "<" + a + "<" + c);
            } else
                System.out.println(+b + "<" + c + "<" + a);
        }
    }
}

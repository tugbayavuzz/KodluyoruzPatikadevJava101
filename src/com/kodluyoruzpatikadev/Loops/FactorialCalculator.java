package com.kodluyoruzpatikadev.Loops;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {

        //n! = 1 * 2 * 3 * 4...*n

        int n,r,total = 1,total2 = 1, total3 = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the n number");
        n = input.nextInt();

        System.out.println("Enter the r number");
        r = input.nextInt();

        for(int i = 1; i<=n; i++){
            total *= i;
        }

        for(int j = 1; j<=r; j++){
            total2 *= j;
        }
        for(int k = 1; k<=n-r; k++){
            total3 *= k;
        }

        double result =  total / (total2 * total3);

        System.out.println( " C(n,r) " + result);

    }
}

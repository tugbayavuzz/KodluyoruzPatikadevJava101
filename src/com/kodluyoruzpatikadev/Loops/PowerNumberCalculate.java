package com.kodluyoruzpatikadev.Loops;

import java.util.Scanner;

public class PowerNumberCalculate {
    public static void main(String[] args) {
        int a, b, total = 1;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the base number ");
        a = input.nextInt();

        System.out.println("Enter the exp number ");
        b = input.nextInt();

        for (int i = 1; i <= b; i++) {
            total *= a;
        }
        System.out.println(total);
    }
}

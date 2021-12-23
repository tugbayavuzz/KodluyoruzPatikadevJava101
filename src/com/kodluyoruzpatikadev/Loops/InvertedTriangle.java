package com.kodluyoruzpatikadev.Loops;

import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = input.nextInt();

        for (int a = n-1; a >= 0; a--){
            for (int b = 0; b >= (a - n-1); b--){
                System.out.print(" ");
            }
            for (int c = (2*a-1); c>=1; c--){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}

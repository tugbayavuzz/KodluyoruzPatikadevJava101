package com.kodluyoruzpatikadev.Loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int number,total = 0,firstTerm = 0 ,secondTerm = 1, i=2;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        number = input.nextInt();

       while (i<=number){
           total = firstTerm+secondTerm;
           firstTerm = secondTerm;
           secondTerm = total;
           i++;

           System.out.print(" " +total);
       }

    }
}

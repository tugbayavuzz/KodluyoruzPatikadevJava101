package com.kodluyoruzpatikadev.Loops;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        int number, digitNumber=0, total=0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number :");
        number = input.nextInt();

        while (number>0){
                digitNumber= number% 10;
                total += digitNumber;
                number /= 10;
        }
        System.out.println(total);
    }
}

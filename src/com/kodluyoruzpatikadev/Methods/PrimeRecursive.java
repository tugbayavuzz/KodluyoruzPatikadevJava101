package com.kodluyoruzpatikadev.Methods;

import java.util.Scanner;

public class PrimeRecursive {
    static int  i = 2;

    static boolean isPrime(int n){
        if (n == 1 || n== 0)
            return false;

        if (n == i)
            return true;

        if (n % i == 0)
        {
            return false;
        }
        i++;
        return isPrime(n);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n= input.nextInt();
        System.out.println(isPrime(n));

    }
}

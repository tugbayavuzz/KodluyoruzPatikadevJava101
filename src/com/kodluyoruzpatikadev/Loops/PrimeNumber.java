package com.kodluyoruzpatikadev.Loops;


public class PrimeNumber {
    public static void main(String[] args) {


        for (int number = 2; number <= 100; number++) {
            int check = 0;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    check = 1;
                    break;
                }
            }

            if (check == 0) {
                System.out.print(number + "\n");

            }
        }
    }
}

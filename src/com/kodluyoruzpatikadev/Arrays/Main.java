package com.kodluyoruzpatikadev.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        double sum2 = 0.0;

        for (int number : numbers) {
            sum += number;
        }

        for (int number2 : numbers) {
            sum2 += (double) 1/number2;
        }
        System.out.println(sum / numbers.length);

        System.out.println(sum2);
    }
}
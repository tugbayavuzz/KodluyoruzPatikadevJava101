package com.kodluyoruzpatikadev.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortAddArray {
    public static void main(String[] args) {

        int number;
        Scanner input = new Scanner(System.in);


        System.out.println("Enter the number");
        number = input.nextInt();
        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Enter   elements of the array");
            array[i] = input.nextInt();
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

    }
}

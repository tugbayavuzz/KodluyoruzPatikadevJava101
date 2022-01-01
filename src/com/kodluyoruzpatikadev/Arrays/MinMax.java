package com.kodluyoruzpatikadev.Arrays;

public class MinMax {
    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};

        int min = list[0];
        int min_2 = list[0];
        int max = list[0];
        int max_2 = list[0];

        for (int i : list) {
            if (i < min) {
                min = i;
               if(min < min_2){
                   min_2 = min;
               }
            }
            if (i > max) {
                max = i;
            }
        }

        System.out.println("Minimum Değer " + min_2);
        System.out.println("Maximum Değer " + max);

    }
}

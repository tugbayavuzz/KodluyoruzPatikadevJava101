package com.kodluyoruzpatikadev.Arrays;

import java.util.Arrays;

public class DuplicateArray {


    public static void main(String[] args) {


        int[] arr = {10, 5, 7, 8, 45, 9, 10, 45, 78, 32};
        Arrays.sort(arr);
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;

                }
            }
            if (i == 0 && arr[i + 1] == arr[i]) {
                System.out.println(String.format("%d 'den %d tane var.", arr[i], count));
            }

            if (i == 0 && arr[i + 1] != arr[i]) {
                System.out.println(String.format("%d 'den %d tane var.", arr[i], count));
            }

            if(i!=0 && arr[i-1]!=arr[i])
            {
                System.out.println(String.format("%d 'den %d tane var.", arr[i], count));
            }
        }


    }
}

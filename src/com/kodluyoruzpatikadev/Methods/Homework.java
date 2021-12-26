package com.kodluyoruzpatikadev.Methods;

import java.util.Scanner;

public class Homework {
    public static void recursiveMethod(int n, int tempN, boolean bool){

        if(n > 0 && bool){
            System.out.print(n + " ");
            recursiveMethod(n - 5, tempN, true);
        } else if(n <= tempN){
            System.out.print(n + " ");
            recursiveMethod(n + 5, tempN, false);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int n = sc.nextInt();
        sc.close();

        recursiveMethod(n, n, true);

    }
}

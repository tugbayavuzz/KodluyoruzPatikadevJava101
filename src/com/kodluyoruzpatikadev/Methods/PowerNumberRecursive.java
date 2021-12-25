package com.kodluyoruzpatikadev.Methods;

import java.util.Scanner;

public class PowerNumberRecursive {

    static int exp(int taban, int üs) {

        if (üs == 0)
            return 1;
        else
            return taban * (exp(taban, üs - 1));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban  giriniz:");
        int taban = scan.nextInt();
        System.out.print("Üs giriniz:");
        int üs = scan.nextInt();

        System.out.println(exp(taban, üs));
    }

}

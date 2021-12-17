package com.kodluyoruzpatikadev.CalculatingTaximeterProgram;

import java.util.Scanner;

public class TaximeterProgramMain {
    public static void main(String[] args) {

        int km;
        double total, perKm = 2.20, startPrice = 10;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the KM: ");
        km = input.nextInt();

        total = perKm*km;
        total += startPrice;

        System.out.println("Total price : " +total);

    }

}

package com.kodluyoruzpatikadev.CalculatingVAT;

import java.util.Scanner;

public class CalculateVATBoolean {
    public static void main(String[] args) {

            double money;

            Scanner cash = new Scanner(System.in);

            System.out.println("Enter the money: ");
            money = cash.nextDouble();
            System.out.println("Money " + money); //exp 10

            boolean money1 = money >= 1000;
            double VAT = money1 ? 0.08 : 1.8;

            double amountVAT = money*VAT;

            double amountWithVAT = VAT + money;
            System.out.println("VAT Ratio : " + VAT); //1.8 should be
            System.out.println("Amount VAT: " + amountVAT); //should be 18.0
            System.out.println("Amount with VAT : " + amountWithVAT); //should be  11.8



    }
}

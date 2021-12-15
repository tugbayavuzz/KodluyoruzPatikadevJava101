package com.kodluyoruzpatikadev.CalculateKDV;

import java.util.Scanner;

public class CalculateKDVMain {
    public static void main(String[] args) {

        double money,ratioVAT = 1.8;

        Scanner cash = new Scanner(System.in);

        System.out.println("Enter the money: ");
        money = cash.nextDouble();
        System.out.println("Money " + money); //exp 10



        double amountVAT = money*ratioVAT;

        double amountWithVAT = ratioVAT + money;
        System.out.println("VAT Ratio : " + ratioVAT); //1.8 should be
        System.out.println("Amount VAT: " + amountVAT); //should be 18.0
        System.out.println("Amount with VAT : " + amountWithVAT); //should be  11.8


/*




 */

    }
}

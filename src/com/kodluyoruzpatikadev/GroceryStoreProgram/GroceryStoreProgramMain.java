package com.kodluyoruzpatikadev.GroceryStoreProgram;

import java.util.Scanner;

public class GroceryStoreProgramMain {
    public static void main(String[] args) {
        double totalAmount,pear = 2.14, apple = 3.67, tomato = 1.11, banana= 0.95, aubergine = 5.00;
        double  pear2, apple2, tomato2, banana2, aubergine2;

        Scanner input = new Scanner(System.in);

        System.out.println("How many kilos of Pear? :");
        pear2 = pear*input.nextDouble ();

        System.out.println("How many kilos of apple? :");
        apple2 = apple*input.nextDouble ();
        System.out.println("How many kilos of tomato? :");
        tomato2 = tomato*input.nextDouble ();
        System.out.println("How many kilos of banana? :");
        banana2 = banana*input.nextDouble ();
        System.out.println("How many kilos of aubergine? :");
        aubergine2 = apple*input.nextDouble ();

        totalAmount = pear2 + apple2 + tomato2 + banana2 + aubergine2;
        System.out.println("Total Amount: " + totalAmount+ "Turkish Liras");
    }
}

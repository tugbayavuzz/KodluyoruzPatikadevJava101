package com.kodluyoruzpatikadev.ChineseZodiacCalculator;

import java.util.Scanner;

public class ZodiacCalculatorMain {
    public static void main(String[] args) {
        int birthYear, remainder;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your birth year: ");
        birthYear = input.nextInt();

        remainder = birthYear % 12;
         if( remainder == 0){
             System.out.println("monkey");
         }
         else if( remainder == 1){
             System.out.println("Cockerel");
         }
         else if(remainder == 2){
             System.out.println("Dog");
         }
         else if(remainder == 3){
             System.out.println("Pig");
         }
         else if(remainder == 4){
             System.out.println("Mouse");
         }
         else if(remainder == 5){
             System.out.println("Bull");
         }
         else if(remainder == 6){
             System.out.println("Tiger");
         }
         else if(remainder == 7){
             System.out.println("Rabbit");
         }
         else if(remainder == 8){
             System.out.println("Dragon");
         }
         else if(remainder == 9){
             System.out.println("Sneak");
         }
         else if(remainder == 10){
             System.out.println("Horse");
         }
         else if(remainder == 11){
             System.out.println("Sheep");
         }
    }
}

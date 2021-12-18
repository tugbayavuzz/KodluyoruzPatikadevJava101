package com.kodluyoruzpatikadev.Calculator;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        int num1, num2;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the num1 : ");
        num1 = input.nextInt();

        System.out.println("Enter the num2 : ");
        num2 = input.nextInt();

        Scanner choice = new Scanner(System.in);

        System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
        int value = choice.nextInt();
        switch (value) {
            case 1:
                System.out.println("Addition : " + (num1+num2));
                break;
            case 2:
                System.out.println("Subtractio : " + (num1-num2));
                break;
            case 3:
                System.out.println("Multiplication : " + (num1*num2));
                break;
            case 4:
                System.out.println("Division : " + (num1/num2));
                break;
            default:
                System.out.println("Value is invalid");
                break;

        }
    }
}

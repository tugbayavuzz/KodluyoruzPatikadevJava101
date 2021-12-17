package com.kodluyoruzpatikadev.BodyMassIndexCalculate;

import java.util.Scanner;

public class BodyMassIndexCalculate {
    public static void main(String[] args) {

        double height, weight, bodyMassIndex;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the height in meters: ");
        height = input.nextDouble();

        System.out.println("Enter the weight: ");
        weight = input.nextDouble();

        bodyMassIndex = weight/(height*height);

        System.out.println("Your body mass index: " + bodyMassIndex);

    }
}

package com.kodluyoruzpatikadev.CalculateCircleArea;

import java.util.Scanner;

public class CalculateCircleMain {
    public static void main(String[] args) {
         int radius;
         //final double PI = 3.14;
         double area, perimeter;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        radius = input.nextInt();

        perimeter = 2*Math.PI*radius;
        System.out.println("Perimeter of the circle: " +perimeter);

        area = (Math.PI*radius*radius);
        System.out.println("Area of the circle: " +area);

    }
}

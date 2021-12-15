package com.kodluyoruzpatikadev.CalculatingHypotenuse;

import java.util.Scanner;

public class HypotenuseMain {
    public static void main(String[] args) {

        int  a,b,c;

        Scanner length = new Scanner(System.in);

        System.out.println("Enter the a length : ");
        a = length.nextInt();

        System.out.println("Enter the b length : ");
        b = length.nextInt();

        System.out.println("Enter the b length : ");
        c = length.nextInt();


        double radius  = (a+b+c)/2.0;
        double perimeter = 2*radius;
        double area = radius*((radius-a)*(radius-b)*(radius-c));
        double area2 = Math.sqrt(area);

        System.out.println("The triangle area is : " + area2);
        System.out.println("The radius  is : " + radius);
        System.out.println("The perimeter  is : " + perimeter);






    }
}

package com.kodluyoruzpatikadev.CalculateGrade;

import java.util.Scanner;

public class CalculateMain {
    public static void main(String[] args) {
        //create variables
        int math, physics, chemical, music;

        //scanner class defined
        Scanner grade = new Scanner(System.in);

        //user variables
        System.out.println("Math Grade : ");
        math = grade.nextInt();

        System.out.println("Physics Grade : ");
        physics = grade.nextInt();

        System.out.println("Chemical Grade : ");
        chemical = grade.nextInt();

        System.out.println("Music Grade : ");
        music = grade.nextInt();

        int sum = (math + chemical + music + physics);
        float result = (float)sum/4;
        System.out.println("Result : " + result);


        /*In the same program, by using conditional expressions if the average of the user is greater than 60,
         the screen should write "Passed in the class",
         if the less, "Failed in the class.
         Note: If and else will be not used
         */

        boolean greater  = result >= 60;
        String query = greater ? "Passed" : "Failed";
        System.out.println(query);

    }
}

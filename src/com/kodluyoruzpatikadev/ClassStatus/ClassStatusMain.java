package com.kodluyoruzpatikadev.ClassStatus;

import java.util.Scanner;

public class ClassStatusMain {
    public static void main(String[] args) {
        int math, physics, chemical, music;

        //scanner class defined
        Scanner grade = new Scanner(System.in);

        //user variables
        System.out.println("Math Grade : ");
        math = grade.nextInt();
        int math1= (math>100 || math<0) ? 0: math;

        System.out.println("Physics Grade : ");
        physics = grade.nextInt();
        int physics1 =(physics>100 || physics<0) ? 0: physics;

        System.out.println("Chemical Grade : ");
        chemical = grade.nextInt();
        int chemical1=(chemical>100 || chemical<0) ? 0: chemical;

        System.out.println("Music Grade : ");
        music = grade.nextInt();
        int music1 =(music>100 || music<0) ? 0 : music;


        int sum = (math1 + chemical1 + music1 + physics1);
        float result = (float)sum/4;
        System.out.println("Result : " + result);

        if(result <=55){
            System.out.println("Failed");
        }
        else
            System.out.println("Passed");
    }

}

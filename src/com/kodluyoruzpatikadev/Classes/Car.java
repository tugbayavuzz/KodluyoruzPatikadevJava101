package com.kodluyoruzpatikadev.Classes;

public class Car
{
    public Car()
    {
        System.out.printf("1");
        new Car(10);
        System.out.printf("5");
    }
    public Car(int temp)
    {
        System.out.printf("2");
        new Car(10, 20);
        System.out.printf("4");
    }
    public Car(int data, int temp)
    {
        System.out.printf("3");

    }

    public static void main(String[] args)
    {
        Car obj = new Car();
    }
}
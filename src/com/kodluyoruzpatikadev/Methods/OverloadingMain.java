package com.kodluyoruzpatikadev.Methods;

public class OverloadingMain {


    static void print() {
        System.out.println("Parameterless method");
    }
    static void print(int a) {
        System.out.println("Parameter method: " +a);
    }

    static void print(double a) {
        System.out.println("Parameter double: " +a);
    }

    static int print(int a, int b) {

        return a+b;
    }
    static int print(int a, int b, int c) {

        return a+b+c;
    }

    public static void main(String[] args) {
        print();
        print(8);
        print(8.0);
        System.out.println(print(2,3));
        System.out.println(print(2,3,4));
    }
}

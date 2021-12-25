package com.kodluyoruzpatikadev.Methods;

public class RecursiveFibonacci {

    static int fibonacci(int n){
        if(n==1  || n ==2){
            return 1;
        }
        int result = fibonacci(n-1)+ fibonacci(n-2);
        return  result;

    }
    public static void main(String[] args) {
        System.out.println(fibonacci(3));
    }
}

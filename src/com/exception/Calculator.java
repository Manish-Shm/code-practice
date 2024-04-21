package com.exception;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Calculator");
        System.out.println("Enter two numbers ");
        int first = input.nextInt();
        int last = input.nextInt();

        try{
            int a[] = new int[5];
            int result = first/last;
            System.out.println(a[6]);
            System.out.printf("Result is = %d",result);
        }
        catch (ArithmeticException exception){
            System.out.println("Divide by Zero Exception please write correct values");
        }
        catch (Throwable t){
            System.out.println("General Exception");
            throw t;
        }

    }
}

package com.exception;

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number");
        int first=s.nextInt();
        System.out.println("Enter second Number ");
        int second = s.nextInt();
        try{
            int result = first/second;
            System.out.printf("Result is = %d",result);
        }catch (ArithmeticException exception){
            if(exception.getMessage().equals("/ by zero")){
                System.out.println("divide by zero exception occured.");
            }else {
                throw exception;
            }
        }

    }

}

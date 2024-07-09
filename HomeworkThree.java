package com.telran.org.lessonfour;

import java.util.Scanner;

public class HomeworkThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number");
        int a = scanner.nextInt();
        System.out.println("Input second number");
        int b = scanner.nextInt();
        System.out.println("Enter method");
        System.out.println("1 - Addition, 2 - Subtraction, 3 - Division, 4 - Multiplication");
        int option = scanner.nextInt();

        switch (option){
            case 1 :
                System.out.println("Sum is " + getSum(a, b));
                break;
            case 2 :
                System.out.println("Difference is " + getDiff(a, b));
                break;
            case 3 :
                System.out.println("Quotient is " + getQuot(a, b));
                break;
            case 4 :
                System.out.println("Product is " + getProd(a, b));
        }
    }

    public static int getSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int getDiff(int a, int b) {
        int diff = a - b;
        return diff;
    }

    public static int getQuot(int a, int b){
        int quot = a / b;
        return quot;
    }

    public static int getProd(int a, int b){
        int prod = a * b;
        return prod;
    }
}

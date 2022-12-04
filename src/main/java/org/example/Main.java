package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Result();
    }
    public static double Sum (double numberOne, double numberTwo){
        return numberOne + numberTwo;
    }

    public static double Minus (double numberOne, double numberTwo){
        return numberOne - numberTwo;
    }

    public static double Multiply (double numberOne, double numberTwo){
        return numberOne * numberTwo;
    }

    public static double Divide (double numberOne, double numberTwo){
        return numberOne / numberTwo;
    }

    public static double Input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        double number = scanner.nextDouble();
        return number;
    }

    public static void Result(){
        double firstNumber = Input();
        double secondNumber = Input();
        System.out.println("Sum of the numbers: " + Sum(firstNumber, secondNumber));
        System.out.println("Difference of the number : " + Minus(firstNumber, secondNumber));
        System.out.println("Multiplication of the numbers: " + Multiply(firstNumber, secondNumber));
        System.out.println("Quotient of the numbers: " + Divide(firstNumber, secondNumber));



    }

}
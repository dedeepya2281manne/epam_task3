package com.designPrinciples;

import java.util.Scanner;

public class App  {
	
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int firstNumber=sc.nextInt();
        System.out.println("Enter second number:");
        int secondNumber=sc.nextInt();
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("Enter any one from above Choices:");
        int choice=sc.nextInt();
        
        Calculator c=new Calculator();
        switch(choice){
        case 1:c.addition(firstNumber, secondNumber);
                break;
        case 2:c.subtraction(firstNumber, secondNumber);
                break;
        case 3:c.multiplication(firstNumber, secondNumber);
                break;
        case 4:c.division(firstNumber, secondNumber);
                break;
        default:System.out.println("Invalid choice!!!");
        }
    }

}
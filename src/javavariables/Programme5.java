package javavariables;

import java.util.Scanner;

public class Programme5 {
    static char operator;
    static double num1, num2;// static variables created

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);// object created for Scanner class to allow user to enter the numbers and operator
        Programme5 transfer = new Programme5();// object created for Programme5


        System.out.print("Enter first number : ");
        num1 = input.nextDouble();
        System.out.print("Enter second number : ");
        num2 = input.nextDouble();
        System.out.print("Enter the operator : ( +,-,*,/ ) : ");

        operator = input.next().charAt(0);//input.next() method has been used to extract string value entered by user for operator
                                          // charAt(0) will provide first character from input.next() and which can be compared in below switch  statement
        switch (operator) { //switch statement is used to check multiple conditions at once
            case '+':       //  different case has been provided to check, two cases can't have same value.
                addition();
                break;     // break statement is used to terminate the statement sequence inside the switch statement.
            case '-':
                subtraction();
                break;      //if break statement is omitted then the execution will continue into the next test case.
            case '*':
                transfer.multiplication();// different static/instance method is called depends on which operator has been entered by user.
                break;
            case '/':
                transfer.division();
                break;
            default:
                System.out.println("Invalid operator has been entered."); //if user enter any other operator than =,-,*,/ then error message will be displayed.
        }
    }
    public static void subtraction() {  // static method used
        System.out.println("Subtraction of :" + num1 + " and " + num2);
        System.out.println(num1 - num2);
    }

    public static void addition() {  // static method used
        System.out.println("Addition of :" + num1 + " and " + num2);
        System.out.println(num1 + num2);
    }

    public void multiplication() {  // instance method used
        System.out.println("Multiplication of :" + num1 + " and " + num2);
        System.out.println(num1 * num2);
    }

    public void division() {  // instance method used
        System.out.println("Division of :" + num1 + " and " + num2);
        System.out.println(num1 * num2);
    }
}



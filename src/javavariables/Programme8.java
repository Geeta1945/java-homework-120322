package javavariables;

import java.util.Scanner;// we imported Scanner class here ,so we can allow user input and can use different methods
                        // found in the class Scanner.

public class Programme8 {

    public static void main(String[] args) {

      Scanner area = new Scanner(System.in); // object for class scanner has been created which allows user to enter details

        System.out.print("Please enter height of triangle: ");

        double height = area.nextDouble();

        System.out.print("Please enter base of triangle: ");


        double base = area.nextDouble();// nextDouble() method of scanner class has been used to convert input received from user into double data type

        double t = 0.5*(height*base); // calculating and storing value of triangle area in double variable t

        System.out.println("Area of a triangle is:   "+ t);


    }


    //A = 1/2 × b × h
}

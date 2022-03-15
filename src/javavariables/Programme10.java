package javavariables;

import java.util.Scanner;// we imported Scanner class here ,so we can allow user input and can use different methods
                        // found in the class Scanner.

public class Programme10 {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);//Scanner class allows user to take input from console.
                                               // System.in is passed as a parameter in Scanner class.

        System.out.print("Please enter number : ");

        int a = number.nextInt(); // nextInt() is method of class Scanner which scans the next token of the input as  integer.


        System.out.println( a + " x " + 1 + " = " + a); // printing all calculations
        System.out.println( a + " x " + 2 + " = " + a*2);
        System.out.println( a + " x " + 3+ " = " + a*3);
        System.out.println( a + " x " + 4 + " = " + a*4);
        System.out.println( a + " x " + 5+ " = " + a*5);
        System.out.println( a + " x " + 6 + " = " + a*6);
        System.out.println( a + " x " + 7 + " = " + a*7);
        System.out.println( a + " x " + 8 + " = " + a*8);
        System.out.println( a + " x " + 9 + " = " + a*9);
        System.out.println( a + " x " + 10 + " = " + a*10);
    }
}

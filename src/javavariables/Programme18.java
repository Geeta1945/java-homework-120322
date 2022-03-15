package javavariables;

import java.util.Scanner;// we imported Scanner class here ,so we can allow user input and can use different methods
// found in the class Scanner.

public class Programme18 {

    public static void main(String[] args) {

        Scanner O = new Scanner(System.in);// System.in method allow user to enter data
        System.out.print("Input first number : "); // allowing user to enter First number
        int a = O.nextInt(); // first number is stored in int a
        System.out.print("Input second  number : ");//allowing user to enter second number
        int b = O.nextInt(); // second number stored in int b
        System.out.println ( a + " + "+ b +" = " +(a+b));
        System.out.println(a + " - "+ b+" = "+(a-b));
        System.out.println(a + " * "+ b+" = "+(a*b));
        System.out.println(a + " / "+ b+" = "+(a/b));
        System.out.println(a + " mod "+ b+" = "+(a/b));


    }
}

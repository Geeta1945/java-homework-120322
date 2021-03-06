package javavariables;

import java.util.Scanner;


public class Programme16 {

    public static void main(String[] args) {

        System.out.println("Welcome to Java program to add two binary numbers");
        Scanner scnr = new Scanner(System.in); // object scnr has been created to call different methods of Scanner class,this class.
        System.out.println("Please enter first binary number : ");
        String first = scnr.nextLine(); // nextLine() method of scanner clss which doesn't accept parameter.
        System.out.println("Please enter second binary number : ");
        String second = scnr.nextLine();// nextLine() method scans from the current position until it finds a line separator delimiter.
        String addition = add(first, second);
        System.out.println("addition of two binary number is : " + addition);
        String sum = sum(first, second);
//            System.out.println("Sum of two binary number is : " + sum);
        scnr.close();
    }

    public static String add(String first, String second) {
        int b1 = Integer.parseInt(first, 2);
        int b2 = Integer.parseInt(second, 2);
        int sum = b1 + b2;
        return Integer.toBinaryString(sum);
    }

    public static String sum(String b1, String b2) { // static method has been declared
        int len1 = b1.length(); //length() is static method of String class and returns the length of a string object
        int len2 = b2.length();
        int carry = 0;
        String res = ""; // the final length of the result depends on the bigger length between b1 // and b,
        // (also the value of carry, if carry = 1, add "1" at the head of result, // otherwise)
        int maxLen = Math.max(len1, len2);
        for (int i = 0; i < maxLen; i++) {
            // start from last char of String b1 and b2 // notice that left side is an int and right side is char
            // so we need to minus the decimal value of '0'
            int p = i < len1 ? b1.charAt(len1 - 1 - i) - '0' : 0; // in binary number addition 0+0=0,0+1=1,1+0=1 and 1+1=10
            int q = i < len2 ? b2.charAt(len2 - 1 - i) - '0' : 0;
            int tmp = p + q + carry;
            carry = tmp / 2;
            res = tmp % 2 + res;
        }
        return (carry == 0) ? res : "1" + res;
    }


}

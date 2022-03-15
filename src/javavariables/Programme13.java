package javavariables;
import java.util.Scanner;// we imported Scanner class here ,so we can allow user input and can use different methods
                        // found in the class Scanner.
public class Programme13 {

    public static void main(String[] args) {

        Scanner avg = new Scanner(System.in);
        //Scanner class allows user to take input from console. System.in is passed as a parameter in Scanner class.

        System.out.print("Please enter FIRST number: ");
        int a = avg.nextInt(); // nextInt() is method of class Scanner which scans the next token of the input as  integer.
        System.out.print("Please enter SECOND number: ");
        int b = avg.nextInt();
        System.out.print("Please enter THIRD number: ");
        int c = avg.nextInt();
        //int d = a+b+c;
        String s = "Average of three numbers is : ";
        System.out.println (s + (a+b+c)/3); // calculating and printing final result



    }
}

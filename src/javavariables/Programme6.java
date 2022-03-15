package javavariables;
import java.util.Scanner;// we imported Scanner class here ,so we can allow user input and can use different methods
                        // found in the class Scanner.

public class Programme6 {

    public static void main (String [] args){

        //Scanner class allows user to take input from console. System.in is passed as a parameter in Scanner class.
        // It tells the java compiler that system input will be provided through console(keyboard).


        System.out.println("Enter the radius of circle : ");

        Scanner r =new Scanner(System.in);// object for class scanner has been created with parameter.



        double radius = r.nextDouble(); // A double type can represent fractional as well as whole values. It can contain up to 15 digits
                                        // nextDouble() method of scanner class has been used to convert input received from user into double data type
        System.out.println(radius);
        double area =  (Math.PI *radius*radius); // calculating area of circle
        System.out.println( "Area of Circle is : "+ area);

    }

}

package javavariables;
import java.util.Scanner; // we imported Scanner class here ,so we can allow user input and can use different methods
                        // found in the class Scanner.

public class Programme7 {


        public static void main(String[] Strings) {

            Scanner input = new Scanner(System.in);// object for class scanner has been created

            System.out.print("Input a degree in Fahrenheit: ");
            double fahrenheit = input.nextDouble();// fahrenheit variable created with double datatype
            // which will store value received after calculation of nextDouble() method -from scanner class(called using input object)


            double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0); // again created variable celsius with double datatype
                                                                // to store fahrenheit to celsius calculation with decimals
            System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
        }
    }




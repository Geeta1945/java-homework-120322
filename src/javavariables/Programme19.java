package javavariables;

import java.util.Locale;// Locale is class
import java.util.Scanner; // Scanner class has been imported to use methods within the class & allow user input
import java.util.Locale;

public class Programme19 {




        public static void main(String[] args) {

            Scanner upper = new Scanner(System.in);// system.in parameter has been used to take input from the standard
            // input -keyboard.
            System.out.print("Please enter sentence in UPPER CASE : ");

            String u = upper.nextLine(); //nextLine() method of the Scanner class to read a line of text from the user.

            System.out.print("Text converted into LOWERCASE : ") ;


            System.out.print(u.toLowerCase(Locale.ROOT));// ToLoweCase -method has been used to convert Upper case String
            // received and stored in u String variable

            //The root locale is the locale whose language, country, and variant are empty ("") strings.
            // This is regarded as the base locale of all locales, and is used as the language/country neutral
            // locale for the locale sensitive operation


        }


    }



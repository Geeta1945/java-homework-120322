package javavariables;

public class Programme2 {
// static variables/methods - declared outside method or constructor and inside the class with static keyword

    // when calling static method you don't need to create object.
static int c= 250;
static String d = "Bonus - £";
    public static void main(String[] args) {

p();

    }

    // static method without parameters
    public static void p(){

        System.out.print(d);
        System.out.println(c);

    }
}




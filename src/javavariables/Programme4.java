package javavariables;


public class Programme4 {
    String name = "My Name is: Neel ";// Instance variable created.
    int a = 20;
    static String p = "My Phone No:";// static variables created
    static int b = 72345678;


    public static void main(String[] args) { // Main method

        Programme4 MyInfo = new Programme4(); // Object created to call instance method -myPersonnelData_1

        myPersonnelData();          // Static method called in main method

        System.out.println("            ");
        MyInfo.myPersonnelData_1();   // instance method called in main method using object MyInfo

    }

    public static void myPersonnelData() { // static method created with keyword STATIC

        Programme4 N = new Programme4();

        String age = "My age is:";  // local string variable created for the static method.
        System.out.println(N.name);// static and instance variables called in Static method and need to create object to call instance method
        System.out.print(age);
        System.out.println(N.a);
        System.out.print(p);
        System.out.println(b);

    }



    public void myPersonnelData_1(){ // instance method created

        String Age = "My age is:"; // local string variable created for the instance method.

        System.out.println(name); // static and instance variables called in instance method and DON'T require creating object for that
        System.out.print(Age);
        System.out.println(a);
        System.out.print(p);
        System.out.print(b);


    }

}

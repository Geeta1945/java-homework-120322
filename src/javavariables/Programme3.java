package javavariables;

public class Programme3 {

    int marks = 40;//instance variable
    static String result = "PASS"; //static variable
    String m = " Marks";// instance variable

    //static method q has been called in main method and instance r method
    public static void main(String[] args) {
        Programme3 t = new Programme3();
        t.r(); //calling instance method via object
        q();

    }

 // calling instance and static variables in static method.
//one object has been created for calling instance variables in static method.
    public static void q() {
        Programme3 a = new Programme3();
        System.out.println(result);
        System.out.print(a.marks);
        System.out.println(a.m);
    }

    public void r() {
// instance method

        System.out.println(result);
        System.out.print(marks);
        System.out.println(m);
    }


}

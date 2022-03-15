package javavariables;

public class Programme1 {

int a= 10;
int b = 2;// static variable declared outside main method but inside class.


    public static void main(String[] args) {

        Programme1 A = new Programme1();
        A.test(); //Instance method called using object A in main method

    }

    public void test(){// instance method created

        System.out.println(a);
        System.out.println(b);

    }

}

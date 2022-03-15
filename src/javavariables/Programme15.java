package javavariables;
public class Programme15 {

    public static void main(String[] args) {

        int p = 10; int q = 25;
        System.out.println("Numbers' value before swapping " );

        System.out.println( "p = " + p+"   "+ "q = " + q);

        int T = p; // value of p been stored into variable T,value of q has been assigned to p,
                  // value of T has been assigned to q.
        p=q;
        q=T;

        System.out.println("Numbers' value after swapping " );
        System.out.println( "p = " + p+"   "+ "q = " + q);

    }

}

package Basics_01;

public class Lab012 {

    public static void main(String[] args) {

        // Decrement operator.

        int a = 10;
        System.out.println(--a + a--);
        System.out.println(a);

        // A -> --b - Exp -> 9 , b = 9
        // B -> b-- -> Exp -> 9 , b -> 8
        int b = 10;
        System.out.println(--b + b++ + ++b);
        System.out.println(b);

        // A -> --b , Exp ->9 , b ->9
        // B -> b++ , Exp 9 , b ->  10
        // C , Exp -> 11 , b - 11

    }
}

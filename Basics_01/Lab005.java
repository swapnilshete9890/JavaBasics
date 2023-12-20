package Basics_01;

public class Lab005 {

    public static void main(String[] args) {

        // Casting - Mold
        //  Widening is the process of converting lower type to higher type. This is safe conversion.

        byte b = 10;
//        int a =  b; // Implicit Casting - JVM
        int a = (int) b; // Explicit Casting - JVM


        // Narrowing is the process of converting higher type to lower type.
        int a1 = 300;
        // byte b1 = a1; // Invalid - Implicit Casting
        byte b1 = (byte)a1; // EXPLICIT casting
        System.out.println(b1);

    }
}

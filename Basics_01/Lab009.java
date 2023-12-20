package Basics_01;

public class Lab009 {

    public static void main(String[] args) {


        // Ternary operator.

        //int a =  condition ?  if this is true print do this :  If false do this

//        int a = true ? 10: 20;
//        int a1 = (30>40) ? 10: 20;
//        System.out.println(a);
//        System.out.println(a1);

        String str= 10 > 20 ? "10" : "TWENTY";
        System.out.println(str);

        String anil_status = true ? "Yes" : "No";
        System.out.println(anil_status);

        System.out.println("----------------------");

        // MAX in two number?

        int a = 10;
        int b = 20;
        int max = a < b ? b : a;
        int min = a < b ? a : b;
        System.out.println(max);
        System.out.println(min);

        System.out.println("----------------------");

        // Ternary operator.

        //int a =  condition ?  if this is true print do this :  If false do this

        // MAX in two number?

        int a1= 40;
        int b1 = 20;
        int c1 = 32;

        // -> ?
        // a > b && a> c -> a

        // (a>c) ? a : c
        // ((b>c) ? b : c)

        int max1 = (a > b) ? ((a1 > c1) ? a1 : c1) : ((b1 > c1) ? b1 : c1);
        System.out.println(max1);




    }
}

package Basics_01;

public class Lab008 {

    public static void main(String[] args) {

        String name = "The Testing Academy"; //SCP
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        String name1 = new String("The Testing Academy"); //OA? HEAP Area

        String name3 = "The Testing Academy";
        String name4 = "The Testing Academy";
        String name5 = new String("The Testing academy"); // Heap area

        System.out.println("--------- ");
//
//        System.out.println(name == name1);
//        System.out.println(name.equals(name1));


//        System.out.println(name == name2);

        System.out.println(name.equals(name5));
        System.out.println(name.equalsIgnoreCase(name5));

        System.out.println("---------- ");

        String s1 = "Pramod";
        System.out.println(s1 instanceof String);
        System.out.println(s1 instanceof Object);
        //Result of instanceof operator is boolean value.

    }
}

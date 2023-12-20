package Basics_02_Loops;

public class Lab022 {

    public static void main(String[] args) {

        // for( A ;B ; C)
        // A -> Initialization -> JVM What variable, where you are starting point
        // B - Condition -> When you want this to stop. -> true, false
        // C ->  Increment / Decrement

        System.out.println("Print the value of i, but I want to break when i = 5");

        for (int i = 1; i <= 10; i++) {
            //  A -> int i = 1
            // B -> i 1 to 10
            // C - i by 1


            if( i ==5){
                break;
            }
            System.out.println("Value of "+ i);
        }

        System.out.println("End");


        System.out.println("--------------------------");

        for (int i = 10; i > 0; i--) {
            System.out.println("Value of " + i);
        }

        System.out.println("End");




    }

}

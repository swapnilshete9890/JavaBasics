package Basics_02_Loops;

public class Lab028 {

    public static void main(String[] args) {

        // While and Do While Loop

        int i = 1; // A - Init
        while(i<=10){ // B - Cond
            System.out.println(i); // D - Code Execute
            i++; // C - I/D (Increment/Decrement)
        }

        System.out.println(" ---- ");



        //For loop

        for (int j = 1; j <=10 ; j++) {
            System.out.println(j);
        }


        // There is no Exit Condition

        int j = 10;
        while(true){ // There is no Exit Condition
            System.out.println("TTA");
        }

    }
}

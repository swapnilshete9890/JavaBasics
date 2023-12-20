package Basics_02_Loops;

public class Lab023 {

    public static void main(String[] args) {

        // Print the Odd number in between the 1 to 50.
        // If Else
        for (int i = 0; i<=50; ++i) {
            if(i%2==0){ // !(i%2==1) OR (i%2==0)
                System.out.println(i+ " is Even!");
            }
        }
        System.out.println(" --- End of Program!! --- ");

        System.out.println("----------------------------");

        int num = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "x"  + i  + " = " + (num*i));
        }
    }
}

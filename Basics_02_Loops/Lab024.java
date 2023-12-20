package Basics_02_Loops;

public class Lab024 {

    public static void main(String[] args) {

        // Continue -?  If this tru -> continue
        for (int i = 0; i < 10; i++) { // 10 Times, i -> 0 to 9
            System.out.println(i);
            if (i == 5) continue;
            System.out.println("**AFTER");
        }

        System.out.println("-----------------------------------------");

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Value Even of ->" + i);
                continue;
            }
            System.out.println("Value Odd of -> " + i);

        }

    }
}
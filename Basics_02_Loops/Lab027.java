package Basics_02_Loops;

import java.util.Scanner;

public class Lab027 {

    public static void main(String[] args) {

        // WAP for Factorial of a number by taking User input

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        long number=sc.nextLong();

        long fact=1;

        for (int i = 1; i <=number ; i++) {

            fact=fact*i;
        }
        System.out.println("Factorial of "+number +" is = "+fact);


        sc.close();
    }
}

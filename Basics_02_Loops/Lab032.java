package Basics_02_Loops;

import java.util.Scanner;

public class Lab032 {

    public static void main(String[] args) {


        // ✅ Grade Calculator:
        // Write a program that calculates and displays the letter grade for a given
        // numerical score (e.g., A, B, C, D, or F) based on the following
        // grading scale:
        //
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: 0-59

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Score: ");
        int score = sc.nextInt();

        if (score >= 90 && score <= 100) {
            System.out.println("Your Grade is: A");
        } else if (score >= 80 && score <= 89) {
            System.out.println("Your Grade is: B");
        } else if (score >= 70 && score <= 79) {
            System.out.println("Your Grade is: C");

        } else if (score >= 60 && score <= 69) {
            System.out.println("Your Grade is: D");
        } else {
            System.out.println("Your Grade is: F");

        }

    }
}

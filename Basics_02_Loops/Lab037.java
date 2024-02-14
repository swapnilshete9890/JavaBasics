package Basics_02_Loops;

import java.util.Scanner;

public class Lab037 {

    public static void main(String[] args) {

        // WAP to identify the Vowels & Consonants using Switch-Break

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char, I will tell you it is Vowel or Consonant");

        char user_input = sc.next().toCharArray()[0];
        System.out.println(user_input);

        switch (user_input) {

            case 'a':
                System.out.println("It is a Vowel");
                break;

            case 'e':
                System.out.println("It is a Vowel");
                break;

            case 'i':
                System.out.println("It is a Vowel");
                break;

            case 'o':
                System.out.println("It is a Vowel");
                break;

            case 'u':
                System.out.println("It is a Vowel");
                break;

            default:
                System.out.println("Not a Vowel, it is a Consonant");

        }

    }
}

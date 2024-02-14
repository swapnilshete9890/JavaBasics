package Basics_02_Loops;

import java.util.Scanner;

public class Lab036 {

    public static void main(String[] args) {


        // WAP Which day is today!! using "Switch-Case"

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1-7, I will tell which day it is");
        // 1 ->  Monday, 7 -> Sunday,  MTWTFSS , invalid -> 99 - are you mad?

        int dayNumber = sc.nextInt();

        switch (dayNumber) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("ARE YOU MAD, PLEASE ENTER VALID DAY NUMBER!!");

        }


    }
}

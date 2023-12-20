package Basics_02_Loops;

import java.util.Scanner;

public class Lab025 {

    public static void main(String[] args) {

        //WAP Even/Odd Number

        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        num=sc.nextInt();

        if(num%2==0)
        {
            System.out.println(num + " is Even number");
        }
        else {
            System.out.println(num + " is Odd number");
        }

        System.out.println("--------------End-------------");

    }
}




























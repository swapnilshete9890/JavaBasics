package Basics_02_Loops;

import java.util.Scanner;

public class Lab014 {

    public static void main(String[] args) {

        //Odd-Even Program

        // Take an input from user? Java
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number, I will tell if it is even/odd");
        int a  = sc.nextInt();


        if(a%2 == 1){
            System.out.println("ODD Number");
        }else{
            System.out.println("Even Number");
        }



    }
}

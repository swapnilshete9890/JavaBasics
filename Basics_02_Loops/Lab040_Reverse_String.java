package Basics_02_Loops;

import java.util.Scanner;

public class Lab040_Reverse_String {

    public static void main(String[] args) {


  // 1: WAP to reverse the string by using without function=>

                Scanner sc= new Scanner(System.in);
                System.out.println("Enter the String which is to be reversed: ");


               String str=sc.next();;
               String rev="";

               for(int i=str.length()-1; i>=0; i--)
               {
                   rev=rev+str.charAt(i);
               }

        System.out.println("Reverse String:"+ rev);



 // 2: WAP to reverse the string by using with function


        Scanner sc1= new Scanner(System.in);
        System.out.println("Enter the string which is to be reversed: ");

        StringBuffer sr = new StringBuffer(sc1.next());

        System.out.println("Reverse String:"+ sr.reverse());






        sc.close();















    }
}

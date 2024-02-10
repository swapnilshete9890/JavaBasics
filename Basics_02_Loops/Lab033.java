package Basics_02_Loops;

import java.util.Scanner;

public class Lab033 {

    public static void main(String[] args) {

        //✅ Triangle Classifier:
        //
        //   Write a program that classifies a triangle based on its side lengths.
        //   Given three input values representing the lengths of the sides, determine

        //   if the triangle is equilateral (all sides are equal),
        //   isosceles (exactly two sides are equal), or
        //   scalene (no sides are equal).
        //   Use an if-else statement to classify the triangle.


        //  side 1, side 2, side 3 ->  side1 == side 2 == side 3 ->  equilateral
        // (side1 == side 2) or side 2 == side 3 -> isosceles
        // scalene (all sides are not equal with each other)

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Side1, Side2, Side3, I will tell you about the triangle : ");

        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        if (side1 == side2 && side2 == side3 && side3== side1)
        {
            System.out.println("Given Triangle is Equilateral Triangle");
        }

        else if (side1 == side2 || side2 == side3 || side3 == side1)
        {
            System.out.println("Given Triangle is Iso-scales Triangle");
        }

        else
        {
            System.out.println("Given Triangle is Scalene Triangle");
        }



    }
}

package Basics_01;

public class Lab010 {

    public static void main(String[] args) {


        // Increment operator.
        // Pre and Post
        int a = 10;
//        a = a+1;
//        a +=1;
        a++; // Post Increment - a = a+1;
        ++a; // Pre Increment  = a = a+1;
        System.out.println(a);


        System.out.println("--------------");

        // Increment operator.
        // Pre and Post

//        int a = 10;
//        System.out.println(++a);
//        // Pre Incremet
//        // ++ in front variable like a -> pre ->
//        // do increment first then print


        int a1 = 10;
        System.out.println(a1++);
        System.out.println(a1);
        // Post Increment
        // ++ after variable like a++ -> post ->
        // first print, do increment

    }
}

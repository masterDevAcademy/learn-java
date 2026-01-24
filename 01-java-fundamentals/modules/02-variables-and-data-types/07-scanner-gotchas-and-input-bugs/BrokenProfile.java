// Lesson 7 - Scanner Gotchas and Input Bugs
// MINI PROJECT - Fix the Broken Input

/*
    Take the broken code (below the fixed section below [commented out]) 
    and fix it using the patterns learned in this lesson.

    Do not rewrite the entire program, remove prompts, change variable 
    types, or add conditionals or loops. 

    ONLY fix Scanner usage.
*/

import java.util.Scanner;

public class BrokenProfile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter city: ");
        String city = scanner.nextLine();

        System.out.println("Age: " + age);
        System.out.println("City: " + city);

        scanner.close();
    }
}



// public class BrokenProfile {
//     public static void main(String[] args) {

//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter age: ");
//         int age = scanner.nextInt();

//         System.out.print("Enter city: ");
//         String city = scanner.nextLine();

//         System.out.println("Age: " + age);
//         System.out.println("City: " + city);
//     }
// }
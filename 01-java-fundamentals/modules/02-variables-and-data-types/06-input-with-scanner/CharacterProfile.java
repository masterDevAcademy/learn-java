// Lesson 6 Input with Scanner
// Mini Project - Interactive Character Profile

/*
    Create a Java program that prompts the user for multiple pieces of information,
    reads both text and numeric input using Scanner, stores user input in variables, 
    and prints a formatted summary using the cllected data.

    Do NOT use conditional logic, loops, input validation, error handling, or fix input
    bugs yet.
*/

import java.util.Scanner;

public class CharacterProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for and read user input here

        System.out.print("Enter your Character's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your character's age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your character's critical hit chance: ");
        double critChance = scanner.nextDouble();

        System.out.print("Enter the city your character is from: ");
        String city = scanner.nextLine();

        scanner.nextLine(); // clear buffer 

        System.out.print("Enter your character's weapon: ");
        String weapon = scanner.nextLine();

        // Print the character profile here

        System.out.println("#############################");
        System.out.println("#     Character Profile     #");
        System.out.println("#############################");
        System.out.println("                             ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Critical Hit Chance: " + critChance);
        System.out.println("City: " + city);
        System.out.println("Weapon: " + weapon);
        System.out.println("                             ");
        System.out.println("#############################");

    scanner.close();

    }

}

/*
    MINI PROJECT TASKS
    ----------------------------------
    Build your own Character Profile with user inputs.


    Requirements:
    - import java.util.scanner
    - Create exactly one Scanner object
    - Use at least:
        - One nextLine()
        - One nextInt() or nextDouble()
    - Store input in appropriately typed variables
    - Print a clean, labeled profile summary
    - Compile and run successfully
*/
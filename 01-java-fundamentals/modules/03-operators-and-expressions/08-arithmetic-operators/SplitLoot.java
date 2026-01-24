// Lesson 8 - Arithmetic Operators
// Mini Project - Loot Splitter

/*
    You are creating a program that stores a total amount of loot and 
    a party size, calculates how much each player gets, calculates how 
    much loot is left over (remainder), and prints a clean summary. 

    Do NOT use loops or conditionals.
    You can use user input (not required but suggested)
*/

import java.util.Scanner;

public class SplitLoot {
    public static void main(String[] args) {
        // Initialize Scanner
        Scanner scanner = new Scanner(System.in);

        // Initialize Variables (Optional: Accept Using Input)
        System.out.print("Enter your party's total loot: ");
        int totalLoot = scanner.nextInt();
        
        System.out.print("Enter your party's size: ");
        int partySize = scanner.nextInt();

        // Calculations
        int eachPlayerGets = totalLoot / partySize;
        int leftover = totalLoot % partySize;

        // Print results

        System.out.println("######################");
        System.out.println("# LOOT SPLIT RESULTS #");
        System.out.println("######################");
        System.out.println("                      ");
        System.out.println("Total Loot: " + totalLoot + " gold");
        System.out.println("Party Size: " + partySize);
        System.out.println("Each Player Gets: " + eachPlayerGets + " gold");
        System.out.println("Leftover Loot: " + leftover + " gold");
        System.out.println("                     ");
        System.out.println("######################");

        scanner.close();
    }    
}

/*
    MINI PROJECT TASKS
    ==================

    Your program must
        - Use int for total loot and party size
        - Use / to complete each share
        - Use % to compute leftover loot
        - Print results using variables (no hardcoded values)
        - Compile and run successfully
*/
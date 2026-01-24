// Lesson 8 - Arithmetic Operators
// Mini Project - Loot Splitter


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

    }    
}

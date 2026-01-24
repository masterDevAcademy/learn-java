// Lesson 2: Java Program Structure & main() 
// MINI PROJECT - Play Stats (PlayerCardPrinter v2)

/*
    This project is going to use variables to create a card that displays
    player stats.

    This project is going to use different information than the last 
    project you did in PlayerCardPrinter.java, so starting from the 
    beginning will be the easier option, but feel free to use the same 
    character, or a whole new one.
*/
public class PlayerStats {
    public static void main(String[] args) {
        // Declare and initialize your variables here

        String name = "Halsin";
        int level = 12;
        int health = 87;
        double critChance = 23.5;
        char rank = 'A';
        boolean alive = true;

        // Print the player stats report here

        System.out.println("#####################");
        System.out.println("#   PLAYER  STATS   #");
        System.out.println("#####################");
        System.out.println("# Name: " + name + "      #");
        System.out.println("# Level: " + level + "         #");
        System.out.println("# Health: " + health + "        #");
        System.out.println("# Crit Chance: " + critChance + " #");
        System.out.println("# Rank: " + rank + "           #");
        System.out.println("# Alive: " + alive + "       #");
        System.out.println("#####################");
    }

}

/*
    MINI PROJECT TASKS
    ----------------------------------
    Build your own Player Stats Engine

    Do NOT use user input(Scanner), conditional logic (if, switch), 
    loops, calculations or game logic, and do not modify variables 
    after initialization.

    Requirements:
    - Declare and initialize at least one variable of each type:
        - String
        - int
        - double
        - boolean
        - char
    - Use meaningful variable names (camelCase)
    - Print all values using variables
    - No hardcoded stats
    - Include a clear title header and visual separators
    - Compile and run without errors.
*/
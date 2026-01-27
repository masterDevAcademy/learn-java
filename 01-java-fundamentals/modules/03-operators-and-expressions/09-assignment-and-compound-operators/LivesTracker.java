// Lesson 9 - Assigment and Compound Operators
// Mini Project - Lives Tracker

/* 
    Create a program that tracks a player's remaining lives as events
    occur in the game. 
    
    The program should start a player with a fixed number of lives, update
    the lives count as the player takes damage or gains bonuses, and print 
    the number of lives after each event.

    Do NOT use loops, conditionals, or randomization. User input is optional, 
    not required. 
    You MUST use assignment, compound operators, and increment/decrement only. 
*/

public class LivesTracker {
    public static void main(String[] args) {
        
        int lives = 5;
        int round = 1;

        System.out.println("############################");
        System.out.println("#      LIVES  TRACKER      #");
        System.out.println("############################");
        System.out.println("                       ");
        System.out.println("Starting Lives: " + lives);
        System.out.println();

        // Round 1: small hit (use decrement)
        System.out.println("Round " + round + ": Took a hit!");
        lives--;
        System.out.println("Lives now: " + lives);
        round++;
        System.out.println();

        // Round 2: heavy hit (use compound operator)
        System.out.println("Round " + round + ": Heavy hit!");
        lives -= 2;
        System.out.println("Lives now: " + lives);
        round++;
        System.out.println();

        //Round 3: found a health shrine (use increment)
        System.out.println("Round " + round + ": Found a bonus life!");
        lives++;
        System.out.println("Lives now: " + lives);
        round++;
        System.out.println();

        // Round 4: trap damage (use compound operator again)
        System.out.println("Round " + round + ": Triggered a trap!");
        lives -= 1;
        System.out.println("Lives now: " + lives);
        round++;
        System.out.println();

        // Final summary (no logic yet)
        System.out.println("============================");
        System.out.println("Final Lives: " + lives);
        System.out.println("Rounds Played: " + (round - 1));
    }
}

/*
    MINI PROJECT TASKS
    ==================
    Your program must: 
        - Declare an initial int variable for lives
        - Update the lives count at least 4 times
        - Use at least: 
            - One compound operator (+= or -=)
            - One increment or decrement (++ or --)
        - Print the lives count after each update
        - Compile and run successfully

*/
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
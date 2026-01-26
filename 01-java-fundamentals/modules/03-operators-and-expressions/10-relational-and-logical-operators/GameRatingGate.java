import java.util.Scanner;

public class GameRatingGate {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Collect Player Info
        System.out.print("Enter player age: ");
        int playerAge = scanner.nextInt();

        System.out.print("Enter required age for the game: ");
        int requiredAge = scanner.nextInt();

        System.out.print("Does the player have parental permission? (true/false): ");
        boolean hasParentPermission = scanner.nextBoolean();

        System.out.print("Does the player have a valid ID? (true/false): ");
        boolean hasValidID = scanner.nextBoolean();

        System.out.print("Is the player banned? (true/false): ");
        boolean isBanned = scanner.nextBoolean();

        scanner.close();

        // Rules Checks (NO if statements)
        boolean meetsAgeRequirements = playerAge >= requiredAge;
        boolean allowedWithPermission = (playerAge < requiredAge) && hasParentPermission;
        boolean passesAgeGate = meetsAgeRequirements || allowedWithPermission;
        boolean passesExtras = hasValidID && !isBanned;

        boolean accessAllowed = passesAgeGate && passesExtras;

        // Output Results 

        System.out.println("#####################");
        System.out.println("# GAME ACCESS CHECK #");
        System.out.println("#####################");
        System.out.println("                     ");
        System.out.println("Player Age: " + playerAge);
        System.out.println("Required Age: " + requiredAge);
        System.out.println("Parental Permission: " + hasParentPermission);
        System.out.println("Has Valid ID: " + hasValidID);
        System.out.println("Banned: " + isBanned);
        System.out.println("                     ");
        System.out.println("#####################");
        System.out.println("                     ");
        System.out.println("Meets Age Requirement: " + meetsAgeRequirements);
        System.out.println("Allowed With Permission: " + allowedWithPermission);
        System.out.println("Passes Age Gate: " + passesAgeGate);
        System.out.println("                     ");
        System.out.println("#####################");
        System.out.println("                     ");
        System.out.println("Access Allowed: " + accessAllowed);
        System.out.println("                     ");
        System.out.println("#####################");
    }
}

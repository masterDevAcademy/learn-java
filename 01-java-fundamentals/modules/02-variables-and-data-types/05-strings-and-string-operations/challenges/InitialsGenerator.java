public class InitialsGenerator {
    public static void main(String[] args) {

        String firstName = "Gale";
        String lastName = "Dekarios";

        String firstInitial = firstName.substring(0, 1);
        String lastInitial = lastName.substring(0, 1);

        System.out.println("Initials: " + firstInitial + ". " + lastInitial + ".");
    }
}

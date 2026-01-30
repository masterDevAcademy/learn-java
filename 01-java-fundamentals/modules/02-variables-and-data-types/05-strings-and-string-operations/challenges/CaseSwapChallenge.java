public class CaseSwapChallenge {
    public static void main(String[] args) {

        String name = "Astarion";
        String title = "vampire";

        String formatted = title.substring(0, 1).toUpperCase() + title.substring(1).toLowerCase();

        System.out.println("Name: " + name);
        System.out.println("Title: " + formatted);
        System.out.println("Profile: " + name + " the " + formatted);
    }
}

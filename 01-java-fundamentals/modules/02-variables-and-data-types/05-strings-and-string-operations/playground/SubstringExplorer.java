public class SubstringExplorer {
    public static void main(String[] args) {

        String name = "Astarion";

        // Change these values and observe what happens
        System.out.println("Full: " + name);
        System.out.println("First 3: " + name.substring(0, 3));
        System.out.println("Last 3: " + name.substring(name.length() - 3));
        System.out.println("Middle: " + name.substring(2, 6));
    }
}

public class IndexVisualizer {
    public static void main(String[] args) {

        String word = "ShadowHeart";

        System.out.println("Word: " + word);
        System.out.println("Indexes:");

        // No loops yet in the course — so we print a few manually
        System.out.println("0: " + word.substring(0, 1));
        System.out.println("1: " + word.substring(1, 2));
        System.out.println("2: " + word.substring(2, 3));
        System.out.println("3: " + word.substring(3, 4));
        System.out.println("4: " + word.substring(4, 5));
    }
}

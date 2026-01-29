package playground;

public class ModulusPractice {
    public static void main(String[] args) {

        int total = 50;
        int boxSize = 8;

        int leftover = total % boxSize;

        System.out.println("If you have " + total + "items and boxes of " + boxSize);
        System.out.println("Leftover items: " + leftover);
    }
}
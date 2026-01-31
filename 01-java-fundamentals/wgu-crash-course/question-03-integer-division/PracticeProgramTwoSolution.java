import java.util.Scanner;

public class PracticeProgramTwoSolution {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Each pizza box holds 8 slices.

        int boxSize = 8;

        // Read the total slices and print how many are left over.

        int totalSlice = scnr.nextInt();

        scnr.close();

        int leftoverSlices = totalSlice / boxSize;

        System.out.println("Leftover slices: " + leftoverSlices);
    }
}
import java.util.Scanner;

public class PracticeProgramTwoSolution {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Read one integer
        int num = scnr.nextInt();

        scnr.close();
        
        // Determine if positive, negative, or 0
        if (num > 0) {
            System.out.println(num + " is positive.");
        } else if (num < 0) {
            System.out.println(num + " is negative.");
        } else {
            System.out.println(num + " is zero.");
        }
    }
}
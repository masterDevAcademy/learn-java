import java.util.Scanner;

public class PracticeProgramOneSolution {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        // Read one integer
        int num = scnr.nextInt();

        scnr.close();
        
        // Determine if its even or odd
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }
}
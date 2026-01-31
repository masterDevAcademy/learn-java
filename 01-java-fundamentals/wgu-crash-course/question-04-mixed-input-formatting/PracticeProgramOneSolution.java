import java.util.Scanner;

public class PracticeProgramOneSolution {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        // Read name, major, and GPA

        String name = scnr.nextLine();
        String major = scnr.nextLine();
        double gpa = scnr.nextDouble();

        scnr.close();

        // Output formatted introduction sentence
        System.out.println(name + " is majoring in " + major + " with a GPA of " + gpa + ".");

    }
}
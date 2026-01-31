import java.util.Scanner;

public class PracticeProgramTwoSolution {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Read name, job title, and hourly wage

        System.out.print("Enter your name: ");
        String name = scnr.nextLine();

        System.out.print("Enter your job title: ");
        String job = scnr.nextLine();

        System.out.print("Enter your hourly wage: ");
        int wage = scnr.nextInt();

        scnr.close();
        // Output formatted job description

        System.out.println(name + " works as a " + job + " earning $" + wage + " per hour.");
    }
}
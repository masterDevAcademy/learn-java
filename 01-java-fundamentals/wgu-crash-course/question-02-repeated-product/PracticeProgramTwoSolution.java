import java.util.Scanner;

public class PracticeProgramTwoSolution {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int startingNum = scnr.nextInt();
        int subtractor = scnr.nextInt();

        // Subtract subtractor three times, printing each new result

        int first = startingNum - subtractor;
        int second = first - subtractor;
        int third = second - subtractor;

        System.out.println(first + " " + second + " " + third);

        scnr.close();
    }
}
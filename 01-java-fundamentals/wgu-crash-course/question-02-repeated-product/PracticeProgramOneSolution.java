import java.util.Scanner;

public class PracticeProgramOneSolution {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        int startingNum = scnr.nextInt();
        int adder = scnr.nextInt();

        // Add adder three time, printing each new result

        int first = startingNum + adder;
        int second = first + adder;
        int third = second + adder;

        System.out.println(first + " " + second + " " + third);

        scnr.close();

    }
}
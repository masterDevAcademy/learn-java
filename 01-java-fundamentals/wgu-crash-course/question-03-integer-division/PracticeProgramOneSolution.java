import java.util.Scanner;

public class PracticeProgramOneSolution {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        // A bus holds 40 passengers

        int busSize = 40;

        // Read the number of passengers and print how many buses are completely filled.

        int passengers = scnr.nextInt();

        scnr.close();

        int busesFilled = passengers / busSize;
        
        System.out.println("Buses Filled: " + busesFilled);
    }
}
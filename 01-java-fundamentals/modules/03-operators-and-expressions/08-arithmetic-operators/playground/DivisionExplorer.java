package playground;

public class DivisionExplorer {
    public static void main(String[] args) {
        int x = 7;
        int y = 2;

        System.out.println("7 / 2 (int): " + (x + y));

        double result1 = x / y;
        double result2 = x / 2.0;
        double result3 = (double) x / y;

        System.out.println("7 / 2 stored as double: " + result1);
        System.out.println("7 / 2.0: " + result2);
        System.out.println("(double)7 / 2: " + result3);
    }
}
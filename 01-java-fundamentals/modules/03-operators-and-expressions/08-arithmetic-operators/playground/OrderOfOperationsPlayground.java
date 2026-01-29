package playground;

public class OrderOfOperationsPlayground {
    public static void main(String[] args) {
        
        int a = 10 + 5 * 2;
        int b = (10 + 5) * 2;

        System.out.println("10 + 5 * 2 = " + a);
        System.out.println("(10 + 5) * 2 = " + b);

        int c = 100 / 5 + 3;
        int d = 100 / (5 + 3);

        System.out.println("100 / 5 + 3 = " + c);
        System.out.println("100 / (5 + 3) = " + d);
    }
}

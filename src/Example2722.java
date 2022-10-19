import java.util.Scanner;
public class Example2722 {
    public static void main(String[] argv) {
        // Fibonacci
        int t, n1 = 1, n2 = 1;
        System.out.print("1, 1");
        for (int i = 3; i <= 40; i++) {
            t = n1 + n2;
            System.out.print(", " + t);
            n1 = n2;
            n2 = t;
        }
        System.out.println();
    }
}

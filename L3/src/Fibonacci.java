// import javax.swing.*;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n, a = 0, b = 1, c;
        // n = Integer.parseInt(JOptionPane.showInputDialog("Input an integer= "));
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.print(a + " " + b + " ");

        while(n - 2 > 0) {
            c = a + b;
            a = b;
            b = c;

            System.out.print(c + " ");
            n--;
        }

    }
}

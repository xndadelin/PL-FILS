import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        while(b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        System.out.println(a);

    }
}

import java.util.Scanner;


public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int reversed = 0, c = n;
        while(n > 0) {
            reversed = reversed * 10 + (n%10);
            n = n / 10;
        }
        if(c == reversed) System.out.println("the number is a palindrome");
        else System.out.println("its not a palindrome");
    }
}

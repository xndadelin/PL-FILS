import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {10, 17, 22, 31, 40, 48, 53, 59, 66, 75};
        int n;
        boolean found = false;

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        int l = 0, r = a.length - 1, mid;
        while(l <= r) {
            mid = (l + r) / 2;
            if(n == a[mid]) {
                System.out.println("the element " + n + " has been found at the index " + mid);
                found = true;
            }
            if(a[mid] < n) l = mid + 1;
            else r = mid - 1;
        }

        if(!found) System.out.println("the element " + n + " was NOT found in the array");
    }
}

import java.util.Scanner;

public class Ex2 {
    public static void main(String args[]){
        //initialize the connection to the keyboard
        Scanner scan=new Scanner(System.in);

        String s = "";

        System.out.println("first name = ");
        String first_name = scan.nextLine();
        System.out.println("last name = ");
        String last_name = scan.nextLine();
        System.out.println("cnp = ");
        String cnp = scan.nextLine();

        // Create and display a password created from the first two letters, lowercase from
        //the first name and last two letters from the last name uppercase.

        s = first_name.substring(0,2).toLowerCase() + last_name.substring(last_name.length() - 2, last_name.length()).toUpperCase();
        System.out.println(s);
    }
}

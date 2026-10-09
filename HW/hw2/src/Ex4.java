public class Ex4 {
    public static void main(String[] args) {
        // i)
        for(int i = 1; i <= 4; i++) {
            System.out.print('\n');
            for(int j = 1; j <= 10; j++)
                System.out.print("*");
        }
        System.out.println();
        System.out.println();

        // i))
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5; j++) {
                if(i >= j)
                    System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5; j++) {
                if(i + j >= 6)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        // iii)


    }
}

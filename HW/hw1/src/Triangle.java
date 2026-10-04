public class Triangle {
    public static void main(String[] args) {
        double a, b, c;
        a = 3;
        b = 4;
        c = 5;
        if((a*a == (b * b + c * c)) || (b*b == (a*a + c*c)) || (c*c == a*a + b *b)) {
            // its definitely a right-angled triangle

            // a 45 degrees triangle has two equal sides
            // a 30 degrees triangle has the hypotenuse double to one of its sides

            if(a == b || b == c || a == c) {
                System.out.println("this triangle is a right-angled triangle with 45 degrees angles");
            } else if(a == b/2 || a == c/2 || b == a/2 || b == c/2 || c == a/2 || c == b/2) {
                System.out.println("this triangle is a right-angled triangle with 30 degrees angle");
            } else {
                System.out.println("this triangle is a right-angled triangle");
            }

        } else {
            System.out.println("the triangle is not a right-angled triangle");
        }
    }
}

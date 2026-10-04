public class Main {
    public static void main(String[] args) {
        // Exercise 1
        {
            int c = -4;
            boolean positive_flag = false;
            if(c >= 0) {
                positive_flag = true;
            }
            if(positive_flag == true) {
                System.out.println("The variable c is a positive number");
            }
            // the error is: java: incompatible types: int cannot be converted to boolean
            // this happens because the boolean type holds only true/false values, and we are trying to assign integers to them
            // to fix this we just assign true to 'positive_flag' instead of 1
            // also after we do this change, we get another error: java: variable positive_flag might not have been initialized
            // this shows because the compiler cannot guarantee that 'positive_flag' will receive a value after the instructions
            // (since the if only evaluates one case), so to fix this case, we either initialize the positive_flag with false, or just
            // write an else instruction when checking positive_flag
        }


        // Exercise 2
        {
            double a, b, c;
            a = 2.2;
            b = 3.3;
            c = 10;

            double harmonic_mean = 3/((1/a) + (1/b) + (1/c));
            System.out.println("the harmonic mean is: " + harmonic_mean);
        }

        // Exercise 3
        {
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

        {
            // Exercise 4
            char grade = 'C';
            int european_grade;
            switch(grade){
                case 'A': european_grade = 10; break;
                case 'B': european_grade = 8; break;
                case 'C': european_grade = 7; break;
                case 'D': european_grade = 6; break;
                case 'F': european_grade = 0; break;
                default: european_grade = -1;
            }
            System.out.println("the American grade " + grade + " transformed into an european grade is " + european_grade);
        }

        {
            // Exercise 5
            String sport = "I like to play basketball";
            sport.replace("basketball", "rowing");
            System.out.println(sport);

        }

    }
}
public class Grade {
    public static void main(String[] args) {
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
}

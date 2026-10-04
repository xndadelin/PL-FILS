public class Error {
    public static void main(String[] args) {
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
}

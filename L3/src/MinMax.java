public class MinMax {
    public static void main(String[] args) {
        int[] a = {4, 2, 1, 7, 0, 8, 3, 9, 6, 5};
        int min = a[0];
        int max = a[0];

        for(int i = 0; i < a.length; i++) {
            if(a[i] < min) min = a[i];
            if(a[i] > max) max = a[i];
        }
        System.out.println("the min is " + min);
        System.out.println("the max is " + max);
    }
}

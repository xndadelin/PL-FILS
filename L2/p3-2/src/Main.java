public class Main {
    public static void main(String[] args) {
        String s = "I am a first year student now";
        int[] f = {0, 0, 0, 0, 0};
        for(int i = 0; i < s.length(); i++) {
            switch(Character.toLowerCase(s.charAt(i))) {
                case 'a': f[0]++; break;
                case 'e': f[1]++; break;
                case 'i': f[2]++; break;
                case 'o': f[3]++; break;
                case 'u': f[4]++; break;
            }
        }

        System.out.println("a appears " + f[0] + " times");
        System.out.println("e appears " + f[1] + " times");
        System.out.println("i appears " + f[2] + " times");
        System.out.println("o appears " + f[3] + " times");
        System.out.println("u appears " + f[4] + " times");
    }
}
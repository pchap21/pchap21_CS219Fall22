package Chapter6Exercises;

public class Exercise6_5 {

    /*
     * Return true if every letter in s appears exactly twice
     */

    public static boolean isDoubloon (String s) {

        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++){
            int cnt = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)){
                    cnt++;
                }
            }
            if (cnt < 2) {
                return false;
            }

        }
        return true;
    }

    public static void main (String [] args) {
        System.out.println(isDoubloon("abba"));
        System.out.println(isDoubloon("ABBA"));
    }
}

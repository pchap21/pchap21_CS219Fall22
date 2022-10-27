package Chapter6Exercises;

public class Exercise6_4 {

    public static String toLower(String s) {

        String r = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                r = r + (char) ('a' + (ch - 'A'));
            }
            else {
                r = r + ch;
            }
        }
        return r;
    }

    public static boolean isAbcedarian(String s) {
        s = s.toLowerCase();
        s = toLower(s);

        // Rewrite using a while loop
        int i = 0;
        while (i < s.length() - 1) {
            if (s.charAt(i) > s.charAt(i + 1)) {
                return false;
            }
            i++;
        }

        return true;
    }

        public static void main (String [] args) {
            System.out.println(toLower("APPLE"));
            System.out.println(toLower("ApPlE"));
            System.out.println(toLower("APPLE!@#%?&"));
            System.out.println(isAbcedarian("biOPsy"));
            System.out.println(!isAbcedarian("banana"));
        }

}



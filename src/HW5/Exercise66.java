package HW5;

public class Exercise66 {

    public static boolean canSpell (String word, String tiles) {
        boolean valid = true;

        for (int i = 0; i < word.length(); i++) {
            int cnt = 0;
            for (int j = 0; j < tiles.length(); j++) {
                if (word.charAt(i) == tiles.charAt(j)) {
                    tiles = tiles.substring(0, j) + tiles.substring(j + 1);
                    cnt++;
                    break;
                }
            }
            if (cnt != 1) {
                valid = false;
            }
        }
        return valid;

    }

    public static void main (String [] args) {
        System.out.println(canSpell("boot", "axobasrto"));
        System.out.println(!canSpell("hippo", "haxobapsrito"));
        System.out.println(canSpell("hello", "llehjhopp"));
        System.out.println(!canSpell("saints", "hello"));
    }

}

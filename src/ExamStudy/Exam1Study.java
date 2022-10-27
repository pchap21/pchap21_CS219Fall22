package ExamStudy;

public class Exam1Study {

    public static double f2c(double f) {
        return 5/9.0 * (f - 32);
    }
    public static void main(String [] args) {
        System.out.println("Hello World");
        System.out.printf("%.2f", f2c(211.9));
        System.out.println(Math.round(6.02235e4));
        System.out.printf("%1.3f\n", 3.14159);
        System.out.println('d' - 'a');  // weird
        System.out.println(2 + "bc");
        System.out.println(2 + 3 + "bc");
        System.out.println((2 + 3) + "bc");
        System.out.println("bc" + 2 + 3);
        System.out.println("bc" + (2 + 3));
        String s = "hippopotomonstrosesquippedaliophobia";
        System.out.println(s.charAt(0));
        System.out.println(s.indexOf('q'));
        System.out.println(s.indexOf('o'));
        System.out.println(s.substring(s.indexOf('m'),16));
        // System.out.println(s.charAt(s.length()));
    }


}

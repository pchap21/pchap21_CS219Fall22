package ExamStudy;

import java.util.Scanner;

public class Exam1StudyC2F2 {

    public static double c2f (double c) {
        return 9.0 / 5.0 * c + 32;
    }

    public static double getValidTemp (Scanner kbd) {
        double c = -1;

        while (true) {
            System.out.print("Enter a temperature in degrees celsius: ");

            if (kbd.hasNextDouble()) {
                c = kbd.nextDouble();
                return c;
            }
            else {
                String str = kbd.next();
                System.out.printf("Error: enter a number. You entered: %s\n", str);
            }
        }

    }

    public static void main (String [] args) {
        Scanner s = new Scanner(System.in);
        double c = getValidTemp(s);
        System.out.printf("%.2f degrees C converts %.2f degrees F", c, c2f(c));

    }
}

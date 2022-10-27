package ExamStudy;

import java.util.Scanner;

public class volumeOfCone2 {

    public static double volumeCone (double r, double h) {
        return 1.0 / 3.0 * Math.PI * Math.pow(r, 2) * h;
    }

    public static double getValidDouble (Scanner s, String prompt) {

        while (true) {
            System.out.print(prompt);
            if (s.hasNextDouble()) {
                double d = s.nextDouble();
                if (d < 0) {
                    System.out.printf("Error: enter a positive number. You entered: %f\n", d);
                }
                else {
                    return d;
                }
            }
            else {
                String str = s.next();
                System.out.printf("Error: use a number. You entered: %s\n", str);
            }
        }

    }
    public static void main (String [] args) {
        Scanner s = new Scanner(System.in);
        double r = getValidDouble(s, "Radius: ");
        double h = getValidDouble(s, "Height ");
        System.out.printf("The volume of the cone is: %.2f", volumeCone(r, h));
    }
}

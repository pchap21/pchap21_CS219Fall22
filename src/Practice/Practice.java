package Practice;

import java.util.Scanner;

public class Practice {
    /**
     *
     * Converts centimeters to feet and inches
     */

    public static void main (String [] args) {

        double cm;
        int feet, inches, remainder;

        double cm_per_inch = 2.54;
        int in_per_foot = 12;

        Scanner in = new Scanner(System.in);

        // prompt the user and get value
        System.out.print("How many cm? ");
        cm = in.nextDouble();

        // convert and output the result
        inches = (int) (cm / cm_per_inch);
        feet = inches / in_per_foot;
        remainder = inches % in_per_foot;
        System.out.printf("%.2f cm = %d ft, %d in\n", cm, feet, remainder);

    }

}

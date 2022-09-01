package Utility;

import java.util.Scanner;

public class Weather {

    public static double windchill(double temperature, // temperature
                                   double wind_velocity) // velocity
    { return 35.74 + 0.62157 * temperature + (0.4275 * temperature - 35.75) * Math.pow(wind_velocity, 0.16);

    }

    public static void main(String [] args) {

        // Used for getting input from the keyboard
        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter temperature in degrees F: ");
        double t = kbd.nextDouble();

        System.out.print("Enter wind velocity in MPH: ");
        double v = kbd.nextDouble();

        System.out.printf("The windchill for %.1f degrees at %.1f MPH, is %.2f\n", t, v, windchill(t, v));


        // Use \ to "escape" the "".
        System.out.println("They said \"Don't do it\"");
    }
}

package Utility;

import java.util.Scanner;

public class Weather {

    public static double windchill(double temperature, // temperature
                                   double wind_velocity) // velocity
    {
        return 35.74 + 0.62157 * temperature + (0.4275 * temperature - 35.75) * Math.pow(wind_velocity, 0.16);

    }

    public static double getVelocity(Scanner s) {
        boolean valid = false;
        double v = 0;

        while (!valid) {
            System.out.print("Enter wind velocity in MPH: ");

            if (s.hasNextDouble()) {
                v = s.nextDouble();
                if (v < 0) {
                    System.out.printf("Error: velocity cannot be negative. You entered \"%.2f\". \n", +v);
                } else {
                    valid = true;
                }
            } else {
                System.out.printf("Error: please enter a decimal number. You entered \"%s\".\n",
                        s.next());
            }
        }
        return v;
    }

    public static double getTemperature(Scanner s) {

        double t = 0;

        while (true) {
            System.out.print("Enter temperature in degrees F: ");

            if (s.hasNextDouble()) {
                t = s.nextDouble();
                break;

            }
            else {
                System.out.printf("Error: enter a valid Temperature: ");
            }
        }
        return t;
    }

    public static void main(String [] args) {

        // Used for getting input from the keyboard
        Scanner kbd = new Scanner(System.in);


        double t = getTemperature(kbd);
        double v = getVelocity(kbd);



        System.out.printf("The windchill for %.1f degrees at %.1f MPH, is %.2f.\n", t, v, windchill(t, v));


        // Use \ to "escape" the "".
        System.out.println("They said \"Don't do it\"");
    }
}

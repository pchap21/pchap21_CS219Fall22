
      //  Philippe Chapleau
      //  11/6/2022
      //  HW2


package HW2;

import java.util.Scanner;

public class DayOfWeek {

    public static int dayofweek(int m, // month
                                int d, // day
                                int y) // year
    {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        return (d + x + 31 * m0 / 12) % 7;
    }

    public static void main(String[] args) {

        // Used for getting input from the keyboard
        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter a month (in number): ");
        int m0 = kbd.nextInt();

        System.out.print("Enter a day: ");
        int d0 = kbd.nextInt();

        System.out.print("Enter a year: ");
        int y0 = kbd.nextInt();

        System.out.println("The day of the week is: " + dayofweek(m0, d0, y0));

    }

}

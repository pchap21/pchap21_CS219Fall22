package HW3;

import Utility.Investment;

import java.util.Scanner;

public class InvestmentCalculator {

    public static void main (String [] args) {

        // prompt the user for  c, r, t, n
        // and call the function with the inputted values

        Scanner kbd = new Scanner(System.in);


        // ask the user for an initial investment
        System.out.print("Enter your initial investment: ");
        double c;

        // check the range and the format
        if (kbd.hasNextDouble()) {

            c = kbd.nextDouble();

            if (c < 0) {
                System.out.print("Error: your number is less than 0." + "You said " + c);
                return;
            }

        }
        else {
            System.out.printf("Error: your number is less than 0" + "You said \"%s\"", kbd.next());
            return;
        }


        // ask the user for an interest rate
        System.out.print("Enter your interest rate with a decimal number: ");
        double r;

        // check the range and the format
        if (kbd.hasNextDouble()) {

            r = kbd.nextDouble();

            if (r < 0 || r > 1) {
                System.out.print("Error: your number is not between 0 and 1." + "You said " + r);
                return;
            }

        }
        else {
            System.out.printf("Error: your number is not between 0 and 1." + "You said \"%s\"", kbd.next());
            return;
        }


        // ask the user for tha amount of years
        System.out.print("Enter the amount of years (with an integer): ");
        int t;

        // check the range and the format
        if (kbd.hasNextInt()) {

            t = kbd.nextInt();

            if (t < 0) {
                System.out.print("Error: your number is less than 0." + "You said " + t);
                return;
            }
        }
        else{
            System.out.printf("Error: your number is less than 0." + "You said \"%s\"", kbd.next());
            return;
        }


        // ask the user for the number of times the investment will be held
        System.out.print("Enter the number of times the investment will be held: ");
        int n;

        // check the range and the format
        if (kbd.hasNextInt()) {

            n = kbd.nextInt();

            if (n < 0) {
                System.out.print("Error: your number is less than 0." + "You said " + n);
                return;
            }
        }
        else{
            System.out.printf("Error: your number is less than 0." + "You said \"%s\"", kbd.next());
            return;
        }

        System.out.printf("Your investment is worth %.2f$", Investment.investment(c, r, t, n));


    }
}

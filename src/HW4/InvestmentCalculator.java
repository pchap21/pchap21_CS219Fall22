package HW4;

import Utility.Investment;

import java.util.Scanner;

public class InvestmentCalculator {



    public static void main (String [] args) {

        // prompt the user for  c, r, t, n
        // and call the function with the inputted values

        Scanner kbd = new Scanner(System.in);


        // ask the user for an initial investment
        double c;
        while (true) {
            System.out.print(" Enter your initial investment: ");

            // check the range and the format
            if (kbd.hasNextDouble()) {

                c = kbd.nextDouble();

                if (c < 0) {
                    System.out.print("Error: your number is less than 0." + "You said " + c);
                }
                else {
                    break;
                }

            } else {
                System.out.printf("Error: your number is less than 0" + "You said \"%s\"", kbd.next());

            }
        }

        // ask the user for an interest rate
        double r;
        while (true) {

            System.out.print(" Enter your interest rate: ");
            // check the range and the format
            if (kbd.hasNextDouble()) {

                r = kbd.nextDouble();

                if (r < 0) {
                    System.out.print("Error: your number cannot be negative." + " You said " + r);

                }
                else {
                    break;
                }

            } else {
                System.out.printf("Error: your number cannot be negative." + "You said \"%s\"", kbd.next());

            }
        }

        // ask the user for tha amount of years
        int t;
        while (true) {
            System.out.print(" Enter the amount of years (with an integer): ");

            // check the range and the format
            if (kbd.hasNextInt()) {

                t = kbd.nextInt();

                if (t < 0) {
                    System.out.print("Error: your number is less than 0." + "You said " + t);

                }
                else {
                    break;
                }
            } else {
                System.out.printf("Error: your number is less than 0." + "You said \"%s\"", kbd.next());

            }
        }

        // ask the user for the number of times the investment will be held
        int n;
        while (true) {
            System.out.print(" Enter the number of times the investment will be held: ");

            // check the range and the format
            if (kbd.hasNextInt()) {

                n = kbd.nextInt();

                if (n < 0) {
                    System.out.print("Error: your number is less than 0." + "You said " + n);

                }
                else {
                    break;
                }
            } else {
                System.out.printf("Error: your number is less than 0." + "You said \"%s\"", kbd.next());

            }
        }
        System.out.printf("Your investment is worth %.2f$", Investment.investment(c, r, t, n));


    }
}

import Utility.Investment;

import java.util.Scanner;

public class InvestmentCalculator {

    public static void main (String [] args) {

        // prompt the user for  c, r, t, n
        // and call the function with the inputted values

        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter c: ");
        double c = kbd.nextDouble();

        System.out.print("Enter r: ");
        double r = kbd.nextDouble();

        System.out.print("Enter t: ");
        int t = kbd.nextInt();

        System.out.print("Enter n: ");
        int n = kbd.nextInt();

        System.out.printf("Your investment is worth %.2f$", Investment.investment(c, r, t, n));


    }
}

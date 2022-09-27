package Exam1;

import java.util.Scanner;

public class Exam1 {

    public static double getCount (double n) {
        int cnt = 0;
        if (n > 7 || n < 2) {
            return cnt;
        }
        else {
           return cnt ++;
        }
    }

    public static double getValidInt (Scanner s, String prompt){

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
        double n = getValidInt(s, "Numbers: ");
        System.out.printf("The number of integers between 2 and 7 exclusive is: %.2f", getCount(n));
    }
}

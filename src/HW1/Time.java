package HW1;

public class Time {

    public static void main (String [] args) {

        // exercise 2.3

        // create the variables
        int hour = 20;
        int minute = 10;
        int second = 20;

        // create the variables for the second time
        int hour1 = 21;
        int minute1 = 50;
        int second1 = 30;

        // print the variables
        System.out.print("The current time is ");
        System.out.print(hour);
        System.out.print(":");
        System.out.print(minute);
        System.out.print(":");
        System.out.print(second);
        System.out.println(".");

        // make the program calculate the number of seconds since midnight
        double a = (hour * 3600) + (minute * 60) + second;
        System.out.print("Number of seconds since midnight: ");
        System.out.println(a);

        // make the program calculate the number of seconds remaining in the day
        double b = 86400 - a;
        System.out.print("Number of seconds remaining in the day: ");
        System.out.println(b);

        // make the program calculate the percentage of the day that has passed
        double c = a / 86400 * 100;
        System.out.print("The percentage of the day that has passed: ");
        System.out.print(c);
        System.out.println("%");

        // compute the elapsed time since I've started this exercise
        System.out.print("The elapsed time since I've started this exercise: ");
        System.out.print(hour1 - hour);
        System.out.print(":");
        System.out.print(minute1 - minute);
        System.out.print(":");
        System.out.println(second1 - second);



    }

}

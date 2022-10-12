package HW6;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class SwallowStats {

    // void function
    public static void swallow_stats () {

        // connect to the web page of speeds
        URL url = null; // null is the "nothing value"
        Scanner s = null;
        String path = "http://10.60.15.25/~ehar/cs219/swallow-speeds.txt";

        try {
            url = new URL(path); // create a URL object for the path
            s = new Scanner(url.openConnection().getInputStream());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        double sum = 0.0;
        int count = 0;
        double max = 0.0;
        double min = 1000000.0; // really big number

        // read each line of the web file
        while (true) {

            if (!s.hasNextLine())
                break;

            String line = s.nextLine(); // read a line of the web site

            if (line.indexOf("#") == -1 && line.length() > 0) { // modify condition
                sum = sum + Double.parseDouble(line);
                count++;

                // find max
                if (Double.parseDouble(line) > max) {
                    max = Double.parseDouble(line);
                }

                // find min
                if (Double.parseDouble(line) < min) {
                    min = Double.parseDouble(line);
                }
            }

        }
        double avg = sum / count;

        // print avg, max, min
        System.out.printf("The average speed is: \t%.2f\n", avg);
        System.out.printf("The maximum speed is: \t%.2f\n", max);
        System.out.printf("The minimum speed is: \t%.2f\n", min);



    }

    // main function
    public static void main (String [] args) {
        swallow_stats();
    }

}

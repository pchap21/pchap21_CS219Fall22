package Exam2;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Exam {

    public static String [] load_words (String path, int n) {

        // connect to the web page of speeds
        URL url = null; // null is the "nothing value"
        Scanner s = null;


        try {
            url = new URL(path); // create a URL object for the path
            s = new Scanner(url.openConnection().getInputStream());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // create an array of strings
        String [] words = new String[n];

        int i = 0;
        while (s.hasNextLine()) {
            words[i++] = s.nextLine();

            if (path.charAt(0) == path.charAt(path.length() - 1) &&
                    isPalindrome2(path.substring(1,path.length() - 1)))
                return words;
            else
                return ???;
        }

        return words;

    }

    public static String reverse(String s) {
        if (s.length() == 0)
            return "";
        else
            return reverse(s.substring(1)) + s.charAt(0);

    }

    public static void main(String[] args) {
        String[] words = load_words("http://10.60.15.25/~ehar/cs219/wordle-nyt-solutions.txt", 2309);
        System.out.println(reverse(words));
    }

}

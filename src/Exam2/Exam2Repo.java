package Exam2;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

import static RecursionExamples.Recursion.isPalindrome;


public class Exam2Repo {

    public static String [] load_words(String path, int n) {
        // connect to the web page of speeds
        URL url = null;    // null is the "nothing value"
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
        }


        // modify to find the palindromes
        String[] palindromes = new String[9];
        int x = 0;

        for(int j = 0; j < words.length; j++) {
            if(isPalindrome(words[j])){
                palindromes[x] = words[j];
                x++;
            }

        }


        return palindromes;


    }


    public static void main(String[] args) {
        String [] palindrome = load_words("http://10.60.15.25/~ehar/cs219/wordle-nyt-solutions.txt", 2309);
        int start = palindrome.length - 1;

        for (int i = 0; i < palindrome.length; i++) {
            System.out.print(palindrome[start] + " ");
            start--;
        }

    }


}

import java.util.Random;

public class LogicalOperators {

    public static void main(String [] args) {

        Random r = new Random();

        int coinflip = r.nextInt(2);

        if (coinflip == 0) {
            System.out.println("Heads");
        }
        else {
            System.out.println("Tails");
        }

        int die1 = r.nextInt(6) + 1;
        int die2 = r.nextInt(6) + 1;

        if (die1 == 1 && die2 == 1) {
            System.out.println("Snake eyes");
        }
        else {
            System.out.println("No Snake eyes");
        }

        // check if die1 is between 2 and 5 inclusive
        if (die1 >= 2 && die1 <= 5) {
            System.out.println("Die1 is between 2 and 5 inclusive");
        }
        else {
            System.out.println("Die1 is not between 2 and 5 inclusive");
        }

        if (die1 != 1)
            System.out.println("Die1 was not one");
        else if (die2 != 1)
            System.out.println("Die2 was not one");



    }

}
